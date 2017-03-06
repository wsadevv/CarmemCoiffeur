package wsadevv.com.carmemcoiffeur.auth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;

import wsadevv.com.carmemcoiffeur.R;
public class CadastrarActivity extends AppCompatActivity {
    private AppCompatButton cadastrarEmail;
    private LoginButton cadastrarFacebook;
    private SignInButton cadastrarGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        cadastrarEmail = (AppCompatButton) findViewById(R.id.btnActivityCadastrar);
        cadastrarFacebook = (LoginButton) findViewById(R.id.cadastrarButtonFacebookID);
        cadastrarGoogle = (SignInButton) findViewById(R.id.cadastrarGoogleID);





    }
    public void cadastrarGoogle(View view){

    }
    public void cadastrarFacebook(View view){

    }
    public void cadastrarEmail(View view){

    }
}
