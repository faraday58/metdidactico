package com.example.metdidactico.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.metdidactico.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class ProductosFragment extends Fragment {

    TextView txtvFragProductosTitulo;
    String titulo;

    public ProductosFragment(String titulo){
        this.titulo= titulo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_productos,container,false);
        txtvFragProductosTitulo= v.findViewById(R.id.txtvFragProductos);
        txtvFragProductosTitulo.setText(titulo);
        return v;
    }
}
