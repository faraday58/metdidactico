package com.example.metdidactico.RecyclerViewMuestra;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.metdidactico.R;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorMuestraProducto extends RecyclerView.Adapter<AdaptadorMuestraProducto.MuestraProductoViewHolder> {

    ArrayList<MuestraProducto> productos;

    public AdaptadorMuestraProducto(ArrayList<MuestraProducto> productos){
        this.productos=productos;
    }

    @NonNull
    @Override
    public MuestraProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_producto,parent,false);


        return new MuestraProductoViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull final MuestraProductoViewHolder holder, int position) {
        MuestraProducto producto = productos.get(position);
        holder.txtvCVtitulo.setText(producto.getTitulo());
        holder.imgbProducto.setImageResource(producto.getImagenProducto());
        holder.txtvCVdescribe.setText(producto.getDescripcion());
        holder.btnCVcoleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"¡¡¡¡ Colección !!!!",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public static class MuestraProductoViewHolder extends RecyclerView.ViewHolder{
        private TextView txtvCVtitulo;
        private ImageButton imgbProducto;
        private TextView txtvCVdescribe;
        private Button btnCVcoleccion;

        public MuestraProductoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtvCVtitulo= itemView.findViewById(R.id.txtvCVTitulo);
            imgbProducto= itemView.findViewById(R.id.imgbCVMuestra);
            txtvCVdescribe= itemView.findViewById(R.id.txtvCVDescribe);
            btnCVcoleccion= itemView.findViewById(R.id.btnCVcoleccion);
        }
    }
}
