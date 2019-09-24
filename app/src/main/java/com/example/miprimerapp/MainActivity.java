package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //EJEMPLO SUMA, PROMEDIO, OPERACIONES BASICAS, REGISTRO
    private EditText et_nombre, et_datos;
    //private Spinner spinner1;
    //private RadioButton rb_suma, rb_resta, rb_mul, rb_div;
    //private CheckBox check1, check2;

    /*private TextView tv1;
    private ListView lv1;
    private String nombres [] = {"Samuel","Valentina","Santiago","Alejandro","Valeria","Benjamin","Gerardo","Carlos","David","Sofía"};
    private String edades [] = {"18","25","32","17","24","20","27","15","19","23"};   */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = (EditText)findViewById(R.id.txt_nombre);
        et_datos = (EditText)findViewById(R.id.txt_bitacora);

        /*et1 = (EditText)findViewById(R.id.txt_mail);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail",""));*/
    }

    //METODO BOTON GUARDAR AGENDA------------------------------------------------------------------------
    /*public void Guardar(View view){
        String nombre = et_nombre.getText().toString();
        String datos = et_datos.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda",Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString(nombre, datos);
        obj_editor.commit();

        Toast.makeText(this,"El contacto ha sido guardado",Toast.LENGTH_SHORT).show();
    }*/

    //METODO BOTON BUSCAR AGENDA------------------------------------------------------------------------
    /*public void Buscar(View view){
        String nombre = et_nombre.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda",Context.MODE_PRIVATE);
        String datos = preferencias.getString(nombre, "");

        if(datos.length() == 0){
            Toast.makeText(this,"No se encontró ningun registro",Toast.LENGTH_SHORT).show();
        }else {
            et_datos.setText(datos);
        }
    }*/

    //METODO BOTON GUARDAR E-MAIL------------------------------------------------------------------------
    /*public void Guardar(View view){
        SharedPreferences preferencias = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString("mail", et1.getText().toString());
        obj_editor.commit();
        finish();
    }*/

    //METODO BOTON ENVIAR, IR------------------------------------------------------------------------
    /*public void Navegar(View view){
        Intent i = new Intent(this, SegundoActivity.class);
        i.putExtra("sitioWeb", et1.getText().toString());
        startActivity(i);
    }*/

    //METODO BOTON SIGUIENTE------------------------------------------------------------------------
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }

    //METODO REGISTRAR------------------------------------------------------------------------------
    /*public void Registrar(View view){
        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        if(nombre.length() == 0){
            Toast.makeText(this,"Dedes de ingresar un nombre", Toast.LENGTH_SHORT).show();
        }if(password.length() == 0){
            Toast.makeText(this,"Dedes de ingresar una contraseña", Toast.LENGTH_SHORT).show();
        }if(nombre.length() != 0 && password.length() != 0) {
            Toast.makeText(this,"Registro en proceso...", Toast.LENGTH_SHORT).show();
        }
    }*/

    //METODO PARA EL IMAGEBUTTON G------------------------------------------------------------------
    public void MensajeG(View view){
        Toast.makeText(this,"Imagen Geekipedia", Toast.LENGTH_SHORT).show();
    }
    //METODO PARA EL IMAGEBUTTON MANO---------------------------------------------------------------
    public void MensajeMano(View view){
        Toast.makeText(this,"Imagen de una mano", Toast.LENGTH_SHORT).show();
    }
    //----------------------------------------------------------------------------------- onCreate()
        /*tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años");
            }
        }); */

        /*spinner1 = (Spinner) findViewById(R.id.spinner);
        String [] opciones = {"sumar","restar","multiplicar","dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);
        spinner1.setAdapter(adapter);*/

        //check2 = (CheckBox) findViewById(R.id.check_Resta);
        //rb_mul = (RadioButton)findViewById(R.id.rb_producto);


    // ESTE MÉTODO REALIZA EL CALCULAR CON SPINNER------------------------------------------------
    /*public  void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_Int = Integer.parseInt(valor1_String);
        int valor2_Int = Integer.parseInt(valor2_String);

        String seleccion = spinner1.getSelectedItem().toString();

        if(seleccion.equals("sumar")){
            int suma = valor1_Int + valor2_Int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(seleccion.equals("restar")){
            int resta = valor1_Int - valor2_Int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if(seleccion.equals("multiplicar")){
            int multiplicacion = valor1_Int * valor2_Int;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        }else if(seleccion.equals("dividir")) {
            if (valor2_Int != 0) {
                int division = valor1_Int / valor2_Int;
                String resultado = String.valueOf(division);
                tv1.setText(resultado);
            } else {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    // ESTE MÉTODO REALIZA EL CALCULAR CON CHECKBOXS------------------------------------------------
    /*public  void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_Int = Integer.parseInt(valor1_String);
        int valor2_Int = Integer.parseInt(valor2_String);

        String resultado = " ";

        if(check1.isChecked() == true){
            int suma = valor1_Int + valor2_Int;
            resultado = "La suma es: " + suma + " / ";
        }if(check2.isChecked() == true) {
            int resta = valor1_Int - valor2_Int;
            resultado += "La resta es: " + resta;
        }
        tv1.setText(resultado);
    }*/

    // ESTE MÉTODO REALIZA EL CALCULAR CON RADIOBUTTONS---------------------------------------------
    /*public  void Calcular(View view){
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
    }*/

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
