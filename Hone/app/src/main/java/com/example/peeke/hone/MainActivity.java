package com.example.peeke.hone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ToggleButton;

//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hone Square");
    }

    public void btnSettings_onClick(View view) {
        Intent intent=new Intent(this,SettingsActivity.class);
        startActivity(intent);

    }

    public void btnRead_onClick(View view) {
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        String sSettig= prefs.getString("example_text","xxx");
        Toast.makeText(this,sSettig,Toast.LENGTH_LONG).show();

    }

    public void cam1_onClick(View view) {

        Intent intent=new Intent(this,Camara1.class);
        startActivity(intent);

    }

    public void cam2_onClick(View view) {
        Intent intent=new Intent(this,Camara2.class);
        startActivity(intent);

    }

    public void cam3_onClick(View view) {

        Intent intent=new Intent(this,Camara3.class);
        startActivity(intent);
    }
}
