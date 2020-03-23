package com.example.metdidactico.RecyclerViews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.metdidactico.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorMuestraProducto extends RecyclerView.Adapter<AdaptadorMuestraProducto.MuestraProductoViewHolder>{

    ArrayList<MuestraProducto> productos;
    IColecProductos activity;

    public interface IColecProductos{
        public void ClickProduccion(String Titulo);
    }

    public  AdaptadorMuestraProducto(Context context, ArrayList<MuestraProducto> productos)
    {
        this.productos= productos;
        activity=(IColecProductos)context;
    }


    @NonNull
    @Override
    public MuestraProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_producto,parent,false);
        return new MuestraProductoViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull MuestraProductoViewHolder holder, int position) {
        final MuestraProducto producto = productos.get(position);
        holder.txtvCVTitutlo.setText(producto.getTitulo());
        holder.imgbCVproducto.setImageResource(producto.getImagenProducto());
        holder.txtvCVdescribe.setText(producto.getDescrpcion());
        holder.btnCVcoleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(view.getContext(),"Estamos en la colección de : " + producto.getTitulo(),Toast.LENGTH_SHORT).show();
                activity.ClickProduccion(producto.getTitulo());

            }
        });
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public static class MuestraProductoViewHolder extends RecyclerView.ViewHolder{
        private  TextView txtvCVTitutlo;
        private ImageButton imgbCVproducto;
        private TextView txtvCVdescribe;
        private Button btnCVcoleccion;

        public MuestraProductoViewHolder(@NonNull View itemView) {
            super(itemView);

            txtvCVTitutlo= itemView.findViewById(R.id.txtvCVTitulo);
            imgbCVproducto= itemView.findViewById(R.id.imgbCVproducto);
            txtvCVdescribe= itemView.findViewById(R.id.txtvCVDescribe);
            btnCVcoleccion= itemView.findViewById(R.id.btnCVcoleccion);

        }
    }

}
