package com.example.peeke.hone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Camara2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara2);
        getSupportActionBar().setTitle("Planta 2");
    }

    public void Manual2_onClick(View view) {
        Intent intent=new Intent(this,ActivityManual1.class);
        startActivity(intent);
    }

    public void Automatic2_onClick(View view) {
        //Aqui se tendra que poner el codigo de reseteo del codigo de arduino
    }
}
