package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //EJEMPLO SUMA, PROMEDIO
    private EditText et_valor1, et_valor2;
    //private EditText et2;
    //private EditText et3;
    private RadioButton rb_suma, rb_resta, rb_mul, rb_div;
    private TextView tv_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                                                                    //EJEMPLO PROMEDIO  // EJEMPLO SUMA MainActivity
        et_valor1 = (EditText)findViewById(R.id.txt__valor1);      //txt_matematicas); //txt_num1);
        et_valor2 = (EditText)findViewById(R.id.txt_valor2);       //txt_fisica);      //txt_num2);
        //et3 = (EditText)findViewById(R.id.                       //txt_quimica);
        tv_resultado = (TextView)findViewById(R.id.tv_resultado);  //tv_estatus);      //txt_resultado);
        rb_suma = (RadioButton)findViewById(R.id.rb_sumar);
        rb_resta = (RadioButton)findViewById(R.id.rb_restar);
        rb_mul = (RadioButton)findViewById(R.id.rb_producto);
        rb_div = (RadioButton)findViewById(R.id.rb_division);
    }

    // ESTE MÉTODO REALIZA EL CALCULAR--------------------------------------------------------------
    public  void Calcular(View view){
        String valor1_String = et_valor1.getText().toString();
        String valor2_String = et_valor2.getText().toString();

        int valor1_Int = Integer.parseInt(valor1_String);
        int valor2_Int = Integer.parseInt(valor2_String);

        if(rb_suma.isChecked() == true){
            int suma = valor1_Int + valor2_Int;
            String resultado = String.valueOf(suma);
            tv_resultado.setText(resultado);
        }else if(rb_resta.isChecked() == true){
            int resta = valor1_Int - valor2_Int;
            String resultado = String.valueOf(resta);
            tv_resultado.setText(resultado);
        }else if(rb_mul.isChecked() == true){
            int multiplicacion = valor1_Int * valor2_Int;
            String resultado = String.valueOf(multiplicacion);
            tv_resultado.setText(resultado);
        }else if(rb_div.isChecked() == true) {
            if(valor2_Int != 0){
                int division = valor1_Int / valor2_Int;
                String resultado = String.valueOf(division);
                tv_resultado.setText(resultado);
            }else {
                Toast.makeText(this,"El segundo valor debe ser diferente de cero",Toast.LENGTH_SHORT).show();
            }
        }
    }

    // ESTE MÉTODO REALIZA EL PROMEDIO--------------------------------------------------------------
    /*public void estatus(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        //String Quimica_String = et3.getText().toString();

        int Matematicas_Int = Integer.parseInt(Matematicas_String);
        int Fisica_Int = Integer.parseInt(Fisica_String);
        int Quimica_Int = Integer.parseInt(Quimica_String);

        int promedio = (Matematicas_Int + Fisica_Int + Quimica_Int) / 3;

        if(promedio >= 6){
            tv1.setText("Estatus Aprobado con " + promedio);
        }else if(promedio <= 5){
            tv1.setText("Estatus Reprobado con " + promedio);
        }
    }*/
    // ESTE MÉTODO REALIZA LA SUMA------------------------------------------------------------------
    /*public void Sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = String.valueOf(suma); //suma + " ";
        tv1.setText(result);
    }*/
        /* PRUEBAS DE DEBUG Y TOAST ----------------------------------------------------------------
        MainActivity

        int matematicas = 5;
        int quimica = 5;
        int fisica = 5;
        int promedio = 0;

        promedio = (matematicas + quimica + fisica) / 3;

        if(promedio >= 6){
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        }else if(promedio <= 5){
            Toast.makeText(this, "Reprobado", Toast.LENGTH_SHORT).show();
        }*/

        //Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // La actividad está creada.

    /* CICLO DEL ACTIVITY --------------------------------------------------------------------------
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }*/
}
