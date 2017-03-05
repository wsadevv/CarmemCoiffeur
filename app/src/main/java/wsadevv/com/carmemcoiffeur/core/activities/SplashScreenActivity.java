package wsadevv.com.carmemcoiffeur.core.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import wsadevv.com.carmemcoiffeur.R;
import wsadevv.com.carmemcoiffeur.utils.FontApplier;


public class SplashScreenActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView textoSplash = (TextView) findViewById(R.id.screenTextID);
        FontApplier fontApplier = new FontApplier();
        fontApplier.apply(textoSplash,getApplicationContext());
        Handler handler = new Handler();
        handler.postDelayed(this,3000);
    }
    @Override
    public void run() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }


}
