package com.example.metdidactico.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.metdidactico.R;
import com.example.metdidactico.RecyclerViewMuestra.AdaptadorMuestraProducto;
import com.example.metdidactico.RecyclerViewMuestra.MuestraProducto;

import java.util.ArrayList;

public class InicioFragment extends Fragment {
    RecyclerView rcvFragInicioProductos;
    ArrayList<MuestraProducto> productos;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View v= inflater.inflate(R.layout.fragment_inicio,container,false);
         rcvFragInicioProductos= v.findViewById(R.id.rcvFragInicioListaProductos);
         LinearLayoutManager llm= new LinearLayoutManager(getActivity());
         llm.setOrientation(LinearLayoutManager.VERTICAL);
         rcvFragInicioProductos.setLayoutManager(llm);
         InicializarMuestrasPRoducto();
         IniciarAdaptador();



        return v ;
    }

    private void IniciarAdaptador()
    {
        AdaptadorMuestraProducto miAdaptador = new AdaptadorMuestraProducto(productos);
        rcvFragInicioProductos.setAdapter(miAdaptador);
    }

    private void InicializarMuestrasPRoducto()
    {
        productos= new ArrayList<>();
        productos.add(new MuestraProducto("Entrena",R.drawable.entrena,"Entrena en donde quieras"));
        productos.add(new MuestraProducto("Compras",R.drawable.compras,"Hasta en las compras luces espectacular"));
        productos.add(new MuestraProducto("Restaurante",R.drawable.restaurante,"Al comer en tu lugar favorito"));
        productos.add(new MuestraProducto("Sencillo",R.drawable.sencillo,"En donde quieras debes ser tú"));
    }
}
