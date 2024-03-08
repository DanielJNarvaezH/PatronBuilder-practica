package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class BuilderArquero implements BuilderPersonaje {

    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private int destreza, agilidad, precision;
    private List<String> listaHabilidades;

    public BuilderArquero() {
        this.listaHabilidades = new ArrayList<>();
      
    }

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
    public void buildHabilidades(List<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    public BuilderArquero buildDestreza(int destreza){
        this.destreza = destreza;
        return this;}

    public BuilderArquero buildAgilidad(int agilidad){
        this.agilidad = agilidad;
        return this;}
    
    public BuilderArquero buildPrecision(int precision){
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
