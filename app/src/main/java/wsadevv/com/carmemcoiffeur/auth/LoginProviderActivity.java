package wsadevv.com.carmemcoiffeur.auth;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;
import android.view.View;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

import wsadevv.com.carmemcoiffeur.R;

public class LoginProviderActivity extends FragmentActivity  {
    //Google
    SignInButton signInButton;
    //Facebook
    LoginButton loginButtonFacebook;

    //Email

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_provider);

        signInButton = (SignInButton) findViewById(R.id.googleSignInID);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        loginButtonFacebook = (LoginButton) findViewById(R.id.loginButtonFacebook);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginProviderActivity.this,LoginGoogle.class);
                startActivity(intent);
            }
        });
        loginButtonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginProviderActivity.this, LoginFacebook.class);
                startActivity(intent);
            }
        });


        



        //Email

    }









    //Email




}