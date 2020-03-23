package com.example.metdidactico.RecyclerViews;

public class MuestraProducto {
    private String titulo;
    private int imagenProducto;
    private String descrpcion;

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

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }




    public MuestraProducto(String titulo, int imagenProducto, String descrpcion) {
        this.titulo = titulo;
        this.imagenProducto = imagenProducto;
        this.descrpcion = descrpcion;
    }
}
