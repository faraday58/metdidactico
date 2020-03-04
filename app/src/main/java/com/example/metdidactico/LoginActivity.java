package com.example.metdidactico;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    EditText edtCorreo;
    EditText edtPassword;

    Button btnIngresar;
    Button btnCrear;

    String correo;
    String password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtCorreo = findViewById(R.id.edtCorreoLogin);
        edtPassword = findViewById(R.id.edtPasswordLogin);
        btnIngresar = findViewById(R.id.btnIngresarLogin);
        btnCrear = findViewById(R.id.btnCrearLogin);

        btnIngresar.setOnClickListener(onClickIngresar);
        btnCrear.setOnClickListener(onClikCrear);

        //Recuperar el valor enviado por medio
        //de un Intent
        try {
            Bundle bundleRegistro = getIntent().getExtras();
            correo = bundleRegistro.getString(getString(R.string.mainStringHintCorreo));
            password = bundleRegistro.getString(getString(R.string.mainStringHintPassword));
        }
        catch (NullPointerException error)
        {
            Toast.makeText(this,"Necesitas crear una cuenta",Toast.LENGTH_SHORT).show();
        }

    }

    View.OnClickListener onClikCrear = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intenCrear = new Intent(getApplicationContext(), RegistroActivity.class);
            startActivity(intenCrear);
            finish();

        }
    };



    View.OnClickListener onClickIngresar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


           new Thread(new Runnable() {
               @Override
               public void run() {
                   try
                   {
                       BuscarUsuario();
                   }
                   catch (InterruptedException e)
                   {
                       Log.d("error",e.getMessage());
                   }
                   Log.d("Hilo","Hilo Terminado");
               }

           }).start();

            if( edtCorreo.getText().toString().equals(correo) && edtPassword.getText().toString().equals(password)  )
            {


                Toast.makeText(getApplicationContext(),"Bienvenido, haz ingresado correctamente",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Correo o Contraseña inválida",Toast.LENGTH_SHORT).show();
            }
        }
    };

    public  void BuscarUsuario() throws InterruptedException {

        for(int i=0; i< 15; i++)
        {
            Thread.sleep(1000);
            Log.d("Segundos","Tiempo de busqueda: " +i +"[s]" );

        }



    }






/*
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Método onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Método onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Método onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Método onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Método onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Método onRestart", Toast.LENGTH_SHORT).show();
    }
 */
}
