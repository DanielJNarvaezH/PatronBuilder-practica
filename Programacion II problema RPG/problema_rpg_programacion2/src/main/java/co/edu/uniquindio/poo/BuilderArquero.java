package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuilderArquero implements BuilderPersonaje {

    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private int destreza, agilidad, precision;
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

    public BuilderArquero builInteligencia(int destreza){
        this.destreza = destreza;
        return this;}

    public BuilderArquero buildAgilidad(int agilidad){
        this.agilidad = agilidad;
        return this;}
    
    public BuilderArquero buildEnergiaMagica(int precision){
        this.precision = precision;
        return this;}

    @Override
    public Personaje buildPersonaje() {

        Personaje personaje = new Arquero();
        personaje.setNombre(nombre);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        personaje.setListaHabilidades(listaHabilidades);
        ((Arquero)personaje).setAgilidad(agilidad);
        ((Arquero)personaje).setDestreza(destreza);
        ((Arquero)personaje).setPrecision(precision);
        return personaje;
    }
}
