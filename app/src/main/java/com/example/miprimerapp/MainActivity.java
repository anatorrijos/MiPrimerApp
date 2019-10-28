package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    /*Button play;
    SoundPool sp;
    int sonido_de_Reproduccion;*/
    //EJEMPLO SUMA, PROMEDIO, OPERACIONES BASICAS, REGISTRO
    //private EditText et_codigo, et_descripcion, et_precio;
    //private Spinner spinner1;
    //private RadioButton rb_suma, rb_resta, rb_mul, rb_div;
    //private CheckBox check1, check2;
    //private ImageView iv1;
    //private Button boton1;
    /*private TextView tv1;
    private ListView lv1;
    private String nombres [] = {"Samuel","Valentina","Santiago","Alejandro","Valeria","Benjamin","Gerardo","Carlos","David","Sofía"};
    private String edades [] = {"18","25","32","17","24","20","27","15","19","23"};   */
    /*Button play_pausa, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, posicion = 0;
    MediaPlayer vectormp [] = new MediaPlayer[3];*/
    /*private MediaRecorder grabacion;
    private String archivoSalida = null;
    private Button btn_recorder;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CAMARA Y VIDEO
        /*img = (ImageView)findViewById(R.id.imageView);
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1000);
        }*/
        //GRABADORA
        /*btn_recorder = (Button) findViewById(R.id.btn_rec);
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }*/
        //SOUNDPOOL
        /*play = (Button) findViewById(R.id.button_play);
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido_de_Reproduccion = sp.load(this, R.raw.sound_short, 1);     */
        //PONER ICONO EN EL ACTION BAR
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        //REPRODUCTOR
        /*play_pausa = (Button)findViewById(R.id.btn_play);
        btn_repetir = (Button)findViewById(R.id.btn_repetir);
        iv = (ImageView)findViewById(R.id.imageView);
        vectormp[0] = MediaPlayer.create(this, R.raw.race);
        vectormp[1] = MediaPlayer.create(this, R.raw.sound);
        vectormp[2] = MediaPlayer.create(this, R.raw.tea);*/
    }
    //METODO GRABAR VIDEO---------------------------------------------------------------------------
    /*static final int REQUEST_VIDEO_CAPTURE = 1;
    public void TomarVideo(View view) { //se debe estar en publico y NO olvidar agregar el parametro View
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
        }
    }*/

    //METODOS CAMARA--------------------------------------------------------------------------------
    //METODO PARA CREAR UN NOMBRE UNICO A CADA FOTO-------------------------------------------------
    /*String mCurrentPhotoPath;
    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "Backup_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(imageFileName, ".jpg", storageDir);

        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = image.getAbsolutePath();
        return image;
    }
    //METODO PARA TOMAR LA FOTO Y CREAR EL ARCHIVO--------------------------------------------------
    static final int REQUEST_TAKE_PHOTO = 1;
    public void tomarFoto(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // Ensure that there's a camera activity to handle the intent
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            // Create the File where the photo should go
            File photoFile = null;
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
                // Error occurred while creating the File
            }
            // Continue only if the File was successfully created
            if (photoFile != null) {
                Uri photoURI = FileProvider.getUriForFile(this,
                        "com.example.android.fileprovider",
                        photoFile);
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                startActivityForResult(takePictureIntent, REQUEST_TAKE_PHOTO);
            }
        }
    }
    //METODO PARA MOSTRAR LA VISTA PREVIA EN UN IMAGEVIEW DE LA FOTO TOMADA-------------------------
    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            img.setImageBitmap(imageBitmap);
        }
    }*/


    //METODOS BOTONES DE ACCION---------------------------------------------------------------------
    //METODO PARA MOSTRAR LOS BOTONES DE ACCION-----------------------------------------------------
    /*public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuacciones,menu);
        return true;
    }
    //METODO PARA AGREGAR ACCIONES A LOS BOTONES----------------------------------------------------
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.compartir){
            Toast.makeText(this,"Compartir",Toast.LENGTH_SHORT).show();
            return true;
        }else if(id == R.id.buscar){
            Toast.makeText(this,"Buscar",Toast.LENGTH_SHORT).show();
            return true;
        }else if(id == R.id.opcion1){
            Toast.makeText(this,"Opcion 1",Toast.LENGTH_SHORT).show();
            return true;
        }else if(id == R.id.opcion2){
            Toast.makeText(this,"Opcion 2",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    //METODOS MENU OVERFLOW-------------------------------------------------------------------------
    //METODO PARA MOSTAR Y OCULTAR EL MENÚ----------------------------------------------------------
    /*public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow,menu);
        return true;
    }
    //METODO PARA ASIGNAR FUNCIONES A LAS OPCIONES--------------------------------------------------
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId(); //se recupera el item que se selecciono
        if(id==R.id.item1){
            Toast.makeText(this,"Opción 1",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item2){
            Toast.makeText(this,"Opción 2",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item3){
            Toast.makeText(this,"Opción 3",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }*/

    //METODOS GRABADORA-----------------------------------------------------------------------------
    //METODO PARA GRABAR
    /*public void Recorder(View view){
        if(grabacion == null){
            archivoSalida = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Grabacion.mp3";
            grabacion = new MediaRecorder();
            grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
            grabacion.setOutputFile(archivoSalida);

            try{
                grabacion.prepare();
                grabacion.start();
            }catch (IOException e){
            }

            btn_recorder.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(),"Grabando",Toast.LENGTH_SHORT).show();
        } else if(grabacion != null){
            grabacion.stop();
            grabacion.release();//estado finalizado
            grabacion = null;
            btn_recorder.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(),"Grabación finalizada",Toast.LENGTH_SHORT).show();
        }
    }
    //METODO PARA REPRODUCIR
    public void Reproducir(View view){
        MediaPlayer mediaPlayer = new MediaPlayer();
        try{
            mediaPlayer.setDataSource(archivoSalida);
            mediaPlayer.prepare();
        }catch (IOException e){

        }
        mediaPlayer.start();
        Toast.makeText(getApplicationContext(),"Reproduciendo audio", Toast.LENGTH_SHORT).show();
    }*/

    //METODOS REPRODUCTOR---------------------------------------------------------------------------
    //METODO PARA EL BOTON PLAY/PAUSE
    /*public void PlayPause(View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play_pausa.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this,"Pausa",Toast.LENGTH_SHORT).show();
        }else {
            vectormp[posicion].start();
            play_pausa.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this,"Play",Toast.LENGTH_SHORT).show();
        }
    }
    //METODO PARA EL BOTON STOP
    public void Stop(View view){
        if (vectormp[posicion] != null){
            vectormp[posicion].stop();

            vectormp[0] = MediaPlayer.create(this, R.raw.race);
            vectormp[1] = MediaPlayer.create(this, R.raw.sound);
            vectormp[2] = MediaPlayer.create(this, R.raw.tea);
            posicion = 0;
            play_pausa.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this,"Stop",Toast.LENGTH_SHORT).show();
        }
    }
    //METODO PARA EL BOTON REPETIR
    public void Repetir(View view){
        if (repetir == 1){
            btn_repetir.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this,"No repetir",Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir = 2;
        }else {
            btn_repetir.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this,"Repetir",Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir = 1;
        }
    }
    //METODO PARA EL BOTON SIGUIENTE
    public void Siguiente(View view){
        if(posicion < vectormp.length -1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }
            }else{
                posicion++;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }
            }
        }else {
            Toast.makeText(this,"No hay más canciones",Toast.LENGTH_SHORT).show();
        }
    }
    //METODO PARA EL BOTON ANTERIOR
    public void Anterior(View view){
        if(posicion >= 1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                //para no perder las canciones
                vectormp[0] = MediaPlayer.create(this, R.raw.race);
                vectormp[1] = MediaPlayer.create(this, R.raw.sound);
                vectormp[2] = MediaPlayer.create(this, R.raw.tea);
                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }
                vectormp[posicion].start();
            }else{
                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                }else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }
            }
        }else {
            Toast.makeText(this,"No hay más canciones",Toast.LENGTH_SHORT).show();
        }
    }*/

    //METODO AUDIO CON SOUNDPOOL--------------------------------------------------------------------
    /*public void AudioSoundPool(View view){
        sp.play(sonido_de_Reproduccion, 1,1,1,0, 0);
    }*/
    //METODO AUDIO CON MEDIAPLAYER------------------------------------------------------------------
    /*public  void  MediaPlayer(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_long);
        mp.start();
    }*/

    //METODO SELECCION FRUTAS SCROLLVIEW------------------------------------------------------------
    /*public void Seleccion(View view){
        switch (view.getId()){
            case R.id.fresas:
                Toast.makeText(this,"Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.uvas:
                Toast.makeText(this,"Estas son uvas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bananas:
                Toast.makeText(this,"Estas son bananas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cerezas:
                Toast.makeText(this,"Estas son cerezas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.frambuesas:
                Toast.makeText(this,"Estas son frambuesas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwis:
                Toast.makeText(this,"Estos son kiwis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mangos:
                Toast.makeText(this,"Estos son mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzanas:
                Toast.makeText(this,"Estas son manzanas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this,"Este es un melon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranjas:
                Toast.makeText(this,"Estas son naranjas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.peras:
                Toast.makeText(this,"Estas son peras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pina:
                Toast.makeText(this,"Esta es uns piña", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandia:
                Toast.makeText(this,"Esta es una sandia", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zarzamoras:
                Toast.makeText(this,"Estas son zarzamoras", Toast.LENGTH_SHORT).show();
                break;
        }
    }*/

    //METODO REGISTRAR OCULTAR FRAMELAYOUT----------------------------------------------------------
    /*public void Ocultar(View view){
        boton1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
    }*/

    //METODO REGISTRAR PRODUCTOS SQLITE-------------------------------------------------------------
    /*public void  Registrar (View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();

        if(!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);

            BaseDeDatos.insert("articulos",null, registro);
            BaseDeDatos.close();
            et_codigo.setText("");
            et_descripcion.setText("");
            et_precio.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();;
        }
    }*/
    //METODO CONSULTAR PRODUCTOS SQLITE-------------------------------------------------------------
    /*public  void  Buscar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if(!codigo.isEmpty()){
            Cursor fila = BaseDeDatos.rawQuery("select descripcion, precio from articulos where codigo = " + codigo, null);
            if(fila.moveToFirst()){
                et_descripcion.setText(fila.getString(0));
                et_precio.setText(fila.getString(1));
                BaseDeDatos.close();
            }else {
                Toast.makeText(this, "No existe el artículo", Toast.LENGTH_SHORT).show();
                BaseDeDatos.close();
            }
        }else {
            Toast.makeText(this, "Debes introducir el código del artículo", Toast.LENGTH_SHORT).show();
        }
    }*/
    //METODO ELIMINAR PRODUCTOS SQLITE--------------------------------------------------------------
    /*public void Eliminar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if(!codigo.isEmpty()){
            int cantidad = BaseDeDatos.delete("articulos","codigo = " + codigo, null);
            BaseDeDatos.close();

            et_codigo.setText("");
            et_precio.setText("");
            et_descripcion.setText("");

            if(cantidad == 1){
                Toast.makeText(this,"Artículo eliminado exitosamente",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"El artículo no existe",Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this,"Debes de introducir el código del artículo",Toast.LENGTH_SHORT).show();
        }
    }*/
    //METODO MODIFICAR PRODUCTOS SQLITE-------------------------------------------------------------
    /*public void  Modificar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String descripcion = et_descripcion.getText().toString();
        String precio = et_precio.getText().toString();

        if(!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()){
            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);

            int cantidad = BaseDeDatos.update("articulos", registro,"codigo = " + codigo,null);
            BaseDeDatos.close();

            if(cantidad == 1){
                Toast.makeText(this,"Artículo modificado correctamente",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"El artículo no existe",Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this,"Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }*/

    //METODO GUARDAR ARCHIVOS EXTERNOS--------------------------------------------------------------
    /*public void Guardar(View view) {
        String nombre = et_nombre.getText().toString();
        String contenido = et_contenido.getText().toString();

        try {
            File tarjetaSD = Environment.getExternalStorageDirectory();
            Toast.makeText(this, tarjetaSD.getPath(), Toast.LENGTH_SHORT).show();
            File rutaArchivo = new File(tarjetaSD.getPath(), nombre);
            OutputStreamWriter crearArchivo = new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));

            crearArchivo.write(contenido);
            crearArchivo.flush();
            crearArchivo.close();

            Toast.makeText(this, "Guardado correctamente", Toast.LENGTH_SHORT).show();
            et_nombre.setText("");
            et_contenido.setText("");
        } catch (IOException e) {
            Toast.makeText(this, "No se pudo guardar", Toast.LENGTH_SHORT).show();
        }
    }*/
    //METODO CONSULTAR ARCHIVOS EXTERNOS------------------------------------------------------------
    /*public  void  Consultar(View view){
        String nombre = et_nombre.getText().toString();

        try{
            File tarjetaSD = Environment.getExternalStorageDirectory();
            File rutaArchivo = new File(tarjetaSD.getPath(),nombre);
            InputStreamReader abrirArchivo = new InputStreamReader(openFileInput(nombre));

            BufferedReader leerArchivo = new BufferedReader(abrirArchivo);
            String linea = leerArchivo.readLine();
            String contenidoCompleto = "";

            while (linea != null){
                contenidoCompleto += linea + "\n";
                linea = leerArchivo.readLine();
            }

            leerArchivo.close();
            abrirArchivo.close();
            et_contenido.setText(contenidoCompleto);
        }catch (IOException e){
            Toast.makeText(this,"Error al leer el archivo",Toast.LENGTH_SHORT).show();
        }
    }*/

    //BITACORA (FICHEROS ALMACENAMIENTO INTERNO)
        /*et1 = (EditText) findViewById(R.id.txt_bitacora);
        String archivos[] = fileList();

        if(ArchivoExiste(archivos, "bitacora.txt")){
            try{
                InputStreamReader archivo = new InputStreamReader(openFileInput("bitacora.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String bitacoraCompleta = "";

                while (linea != null){
                    bitacoraCompleta += linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(bitacoraCompleta);
            }catch (Exception e){

            }
        }*/
    //METODO ARCHIVO EXISTE BITACORA----------------------------------------------------------------
    /*private boolean ArchivoExiste(String archivos[], String nombreArchivo){
        for (int i = 0; i < archivos.length; i++)
            if(nombreArchivo.equals(archivos[i]))
                return true;
        return false;
    }*/
    //METODO GUARDAR BITACORA-----------------------------------------------------------------------
    /*public void Guardar(View view) {
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("bitacora.txt", Activity.MODE_PRIVATE));
            archivo.write(et1.getText().toString());
            archivo.flush();
            archivo.close();
        }catch (Exception e){

        }
        Toast.makeText(this, "Bitacora guardada correctamente", Toast.LENGTH_SHORT).show();
        finish();
    }*/

    //AGENDA (SHAREPREFERENCES)
        /*et1 = (EditText)findViewById(R.id.txt_mail);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail",""));*/
    //METODO BOTON GUARDAR AGENDA-------------------------------------------------------------------
    /*public void Guardar(View view){
        String nombre = et_nombre.getText().toString();
        String datos = et_datos.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda",Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString(nombre, datos);
        obj_editor.commit();

        Toast.makeText(this,"El contacto ha sido guardado",Toast.LENGTH_SHORT).show();
    }*/
    //METODO BOTON BUSCAR AGENDA--------------------------------------------------------------------
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

    //METODO BOTON GUARDAR E-MAIL-------------------------------------------------------------------
    /*public void Guardar(View view){
        SharedPreferences preferencias = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString("mail", et1.getText().toString());
        obj_editor.commit();
        finish();
    }*/
    //METODO BOTON ENVIAR, IR-----------------------------------------------------------------------
    /*public void Navegar(View view){
        Intent i = new Intent(this, SegundoActivity.class);
        i.putExtra("sitioWeb", et1.getText().toString());
        startActivity(i);
    }*/

    //METODO BOTON SIGUIENTE------------------------------------------------------------------------
    /*public void Siguiente(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }*/

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
    /*public void MensajeG(View view){
        Toast.makeText(this,"Imagen Geekipedia", Toast.LENGTH_SHORT).show();
    }
    //METODO PARA EL IMAGEBUTTON MANO---------------------------------------------------------------
    public void MensajeMano(View view){
        Toast.makeText(this,"Imagen de una mano", Toast.LENGTH_SHORT).show();
    }*=
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
