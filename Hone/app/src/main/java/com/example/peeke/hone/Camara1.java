package com.example.peeke.hone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Camara1 extends AppCompatActivity {
    String global1 = "http://158.69.206.28:85/data/get/XB0";
    String tempagua = "http://158.69.206.28:85/data/get/WT";
    String tempaire = "http://158.69.206.28:85/data/get/AT";
    String humeagua = "http://158.69.206.28:85/data/get/AH";
    String intenluz = "http://158.69.206.28:85/data/get/PWM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara1);
        getSupportActionBar().setTitle("Planta 1");

        WebView objeto=(WebView) this.findViewById(R.id.idwebglobal);
        objeto.setWebViewClient(new WebViewClient());
        objeto.loadUrl(global1);

        WebView objeto1=(WebView) this.findViewById(R.id.idweb1);
        objeto1.setWebViewClient(new WebViewClient());
        objeto1.loadUrl(tempagua);

        WebView objeto2=(WebView) this.findViewById(R.id.idweb2);
        objeto2.setWebViewClient(new WebViewClient());
        objeto2.loadUrl(tempaire);

        WebView objeto3=(WebView) this.findViewById(R.id.idweb3);
        objeto3.setWebViewClient(new WebViewClient());
        objeto3.loadUrl(humeagua);

        WebView objeto4=(WebView) this.findViewById(R.id.idweb4);
        objeto4.setWebViewClient(new WebViewClient());
        objeto3.loadUrl(intenluz);
    }


    public void Manual1_onClick(View view) {
        Intent intent=new Intent(this,ActivityManual1.class);
        startActivity(intent);

    }

    public void Automatic_onClick(View view) {

        }

}
