package wsadevv.com.carmemcoiffeur.admin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

import wsadevv.com.carmemcoiffeur.R;
import wsadevv.com.carmemcoiffeur.core.dao.FirebaseDB;
import wsadevv.com.carmemcoiffeur.core.dao.Procedimento;

public class AdminControlsActivity extends Activity {
    private ArrayList<Procedimento> procedimentos;
    private ListView mListRef;

    DatabaseReference mFireRefRoot = new FirebaseDB().getDatabase().getReference();
    FirebaseListAdapter<Procedimento> procedimentoFirebaseListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_controls);
        mListRef = (ListView) findViewById(R.id.procedureListID);
        procedimentoFirebaseListAdapter = new FirebaseListAdapter<Procedimento>(this,
                Procedimento.class, android.R.layout.simple_list_item_1, mFireRefRoot.child("Procedimento")) {
            @Override
            protected void populateView(View v, Procedimento model, int position) {
                TextView textView = (TextView) v.findViewById(android.R.id.text1);
                String data = model.toString();
                try{
                    textView.setText(data);
                }catch (NullPointerException e){
                    Log.i("Null pointer",e.getMessage());
                }
                Log.i("Model Snapshot",model.toString());
            }

        };
        mListRef.setAdapter(procedimentoFirebaseListAdapter);

    }



}
