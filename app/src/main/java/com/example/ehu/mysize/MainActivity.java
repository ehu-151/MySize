package com.example.ehu.mysize;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String NECK = "NECK";
    private static final String SLEEVE = "SLEEVE";
    private static final String WAIST = "WAIST";
    private static final String INSEAM = "INSEAM";
    private EditText editNeck;
    private EditText editSleeve;
    private EditText editWaist;
    private EditText editInseam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String neck = pref.getString(NECK, "");
        String sleeve = pref.getString(WAIST, "");
        String waist =pref.getString(WAIST,"");
        String inseam = pref.getString(INSEAM, "");

        editNeck = (EditText) findViewById(R.id.neck);
        editSleeve = (EditText) findViewById(R.id.sleeve);
        editWaist = (EditText) findViewById(R.id.waist);
        editInseam = (EditText) findViewById(R.id.inseam);

        editNeck.setText(neck);
        editSleeve.setText(sleeve);
        editWaist.setText(waist);
        editInseam.setText(inseam);
    }

    public void onSaveTapped(View view){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editer = pref.edit();
        editer.putString("NECK",editNeck.getText().toString());
        editer.putString("SLEEVE",editSleeve.getText().toString());
        editer.putString("WAIST",editWaist.getText().toString());
        editer.putString("INSEAM", editInseam.getText().toString());
        editer.commit();
    }
}
