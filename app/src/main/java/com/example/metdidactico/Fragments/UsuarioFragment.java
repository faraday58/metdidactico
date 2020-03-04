package com.example.metdidactico.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.metdidactico.LoginActivity;
import com.example.metdidactico.R;
import com.example.metdidactico.RegistroActivity;

public class UsuarioFragment extends Fragment {

    Button btnLoginFragUsuario;
    Button btnSignFragUsuario;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View v= inflater.inflate(R.layout.fragment_usuario,container,false);
         btnLoginFragUsuario = v.findViewById(R.id.btnLoginFragUsuario);
         btnSignFragUsuario = v.findViewById(R.id.btnSignFragUsuario);
         btnLoginFragUsuario.setOnClickListener(onClickLogin);
         btnSignFragUsuario.setOnClickListener(onClickRegistrar);

        return v ;
    }

    View.OnClickListener onClickLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intLogin= new Intent(getActivity(), LoginActivity.class);
            startActivity(intLogin);
        }
    };

    View.OnClickListener onClickRegistrar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intRegistro = new Intent(getActivity(), RegistroActivity.class);
            startActivity(intRegistro);
        }
    } ;




}
