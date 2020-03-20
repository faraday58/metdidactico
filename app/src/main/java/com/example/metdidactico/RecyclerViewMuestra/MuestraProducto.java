package com.example.metdidactico.RecyclerViewMuestra;

public class MuestraProducto {
    private String titulo;

    private int imagenProducto;
    private String descripcion;

    public MuestraProducto(String titulo, int imagenProducto, String descripcion) {
        this.titulo = titulo;
        this.imagenProducto = imagenProducto;
        this.descripcion = descripcion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(int imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
