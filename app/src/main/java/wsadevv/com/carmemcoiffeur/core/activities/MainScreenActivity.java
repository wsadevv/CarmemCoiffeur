package wsadevv.com.carmemcoiffeur.core.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import wsadevv.com.carmemcoiffeur.R;
import wsadevv.com.carmemcoiffeur.auth.CadastrarActivity;
import wsadevv.com.carmemcoiffeur.auth.LoginProviderActivity;

public class MainScreenActivity extends AppCompatActivity {
    private AppCompatButton login;
    private AppCompatButton cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);


        login = (AppCompatButton) findViewById(R.id.btnEntrar);
        cadastrar = (AppCompatButton) findViewById(R.id.btnCadastrar);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, LoginProviderActivity.class);
                startActivity(intent);
            }
        });
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CadastrarActivity.class);
                startActivity(intent);
            }
        });
    }
}
