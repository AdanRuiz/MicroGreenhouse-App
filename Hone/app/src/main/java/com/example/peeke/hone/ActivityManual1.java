package com.example.peeke.hone;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class ActivityManual1 extends AppCompatActivity {

    ProgressDialog pd;
    TextView txtJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual1);
        getSupportActionBar().setTitle("Manual Settings");


        Button manualbtn1 = (Button)findViewById(R.id.manualbtn1);
        TextView tvData = (TextView)findViewById(R.id.manualbtn1);

        txtJson = (TextView) findViewById(R.id.txtJson);

        Button manualbtn2 = (Button)findViewById(R.id.manualbtn2);
        tvData = (TextView) findViewById(R.id.manualbtn2);


        final TextView finalTvData1 = tvData;
        manualbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new JsonTask().execute("http://10.0.5.118/data/put/WPT/1");



//                mostrar daros nivel 1
//                new JsonTask().execute("http://10.0.5.118/data/get/Nivel1");


            }
        });


        final TextView finalTvData = tvData;
        manualbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new JsonTask().execute("http://10.0.5.118/data/put/WPT/5");

            }
        });


    }

    private class JsonTask extends AsyncTask<String, String, String> {

        protected void onPreExecute() {
            super.onPreExecute();

            pd = new ProgressDialog(ActivityManual1.this);
            pd.setMessage("Please wait");
            pd.setCancelable(false);
            pd.show();
        }

        protected String doInBackground(String... params) {


            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();


                InputStream stream = connection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null) {
                    buffer.append(line+"\n");
                    Log.d("Response: ", "> " + line);   //here u ll get whole response...... :-)

                }

                return buffer.toString();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (pd.isShowing()){
                pd.dismiss();
            }
            txtJson.setText(result);
        }
    }



}//activiity
//    public void restaurar1_onClick(View view) {
//        Intent restaurarIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http:10.0.5.118/data/get/WPT"));
//        startActivity(restaurarIntent);
//
//    }
//
//    public void tiempo1_onClick(View view) {
//        Intent tiempoIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http:10.0.5.118/data/put/WPT/5"));
//        startActivity(tiempoIntent);
//
//    }
