package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuilderGuerrero implements BuilderPersonaje {
    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private ArrayList<String> listaHabilidades;
    
    @Override
    public void buildNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void buildDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void buildApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public void buildDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    @Override
    public void buildHabilidades(ArrayList<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    @Override
    public Personaje buildPersonaje() {
        return new Personaje (nombre, descripcion, apodo, dineroInicial, listaHabilidades);
    }

}
