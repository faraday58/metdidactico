package com.example.metdidactico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {
    EditText edtNombre;
    EditText edtCorreo;
    EditText edtPassword;
    Button   btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Relacionando objetos Java con los objetos XML
        edtNombre = findViewById(R.id.edtNombreMain);
        edtCorreo = findViewById(R.id.btnCrearLogin);
        edtPassword= findViewById(R.id.edtPasswordMain);
        btnCrear = findViewById(R.id.btnCrearMain);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombre= edtNombre.getText().toString();
                String Correo = edtCorreo.getText().toString();
                String Contraseña= edtPassword.getText().toString();

                if(Nombre.length() ==  0 )
                {
                    Toast.makeText(getApplicationContext(), "Debes ingresar un Nombre", Toast.LENGTH_SHORT).show();
                }
                if(Correo.length() ==0){
                    Toast.makeText(getApplicationContext(), "Debes ingresar un Correo", Toast.LENGTH_SHORT).show();
                }
                if(Contraseña.length() ==0){
                    Toast.makeText(getApplicationContext(), "Debes ingresar un Password", Toast.LENGTH_SHORT).show();
                }
                if( Nombre.length() != 0 && Correo.length() !=0 && Contraseña.length() !=0)
                {
                    Toast.makeText(getApplicationContext(), "Te haz registrado con éxito: " + Nombre , Toast.LENGTH_SHORT).show();
                    Intent intentLogin= new Intent(getApplicationContext() ,LoginActivity.class);
                    intentLogin.putExtra(getString(R.string.mainStringHintCorreo),Correo );
                    intentLogin.putExtra(getString(R.string.mainStringHintPassword),Contraseña);
                    startActivity(intentLogin);
                    finish();

                }

            }
        });



    }
}
