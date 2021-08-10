package com.example.examen;

public class Items {
    public int num;
    public String codigo,descripcion,marca;
    public int stock;
    public double unidad,decena;

    public Items(int num,String codigo, String descripcion, String marca, int stock, double unidad, double decena) {
        this.num= num;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.unidad = unidad;
        this.decena = decena;
    }
}
