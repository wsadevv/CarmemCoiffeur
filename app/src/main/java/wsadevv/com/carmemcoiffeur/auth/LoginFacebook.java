package wsadevv.com.carmemcoiffeur.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import wsadevv.com.carmemcoiffeur.R;

public class LoginFacebook extends AppCompatActivity {
    CallbackManager callbackManager;
    LoginButton loginButtonFacebook;
    AppCompatTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login_facebook);
        textView = (AppCompatTextView) findViewById(R.id.logado_facebook);

        //Facebook
        initializeControls();
        loginFacebook();
    }
    //Facebook
    private void initializeControls() {
        callbackManager = CallbackManager.Factory.create();
        loginButtonFacebook = (LoginButton) findViewById(R.id.loginButtonFacebook);


    }
    private void loginFacebook(){
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                textView.setText("Login success\n"+loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {
                textView.setText("Login cancelled!");

            }

            @Override
            public void onError(FacebookException error) {
                textView.setText("Login Error\n"+error.getMessage());

            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
