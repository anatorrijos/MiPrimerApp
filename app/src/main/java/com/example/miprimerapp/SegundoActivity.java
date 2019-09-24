package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    //private TextView tv1;
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        /*wv1 = (WebView)findViewById(R.id.wv1);
        String URL = getIntent().getStringExtra("sitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://" + URL);
        */
    }

    //METODO BOTON CERRAR---------------------------------------------------------------------------
    public void Cerrar(View view){
        finish();
    }

    //METODO BOTON EJ ANTERIOR, REGRESAR------------------------------------------------------------
    public void Regresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
