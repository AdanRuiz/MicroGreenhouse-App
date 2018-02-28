package com.example.peeke.hone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Camara3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara3);
        getSupportActionBar().setTitle("Planta 3");
    }

    public void Manual3_onClick(View view) {
        Intent intent=new Intent(this,ActivityManual1.class);
        startActivity(intent);

    }

    public void Automatic3_onClick(View view) {
        //Aqui se tendra que poner el codigo de reseteo del codigo de arduino

    }
}
