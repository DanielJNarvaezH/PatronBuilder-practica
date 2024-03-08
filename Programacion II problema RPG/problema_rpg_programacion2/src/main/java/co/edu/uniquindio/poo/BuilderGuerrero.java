package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class BuilderGuerrero implements BuilderPersonaje {
    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private int fuerza, resistencia, vitalidad;
    private List<String> listaHabilidades;

    public BuilderGuerrero() {
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

    public BuilderGuerrero buildFuerza(int fuerza){
        this.fuerza = fuerza;
        return this;
    }

    public BuilderGuerrero buildResistencia(int resistencia){
        this.resistencia = resistencia;
        return this;
    }
    
    public BuilderGuerrero buildVitalidad(int vitalidad){
        this.vitalidad = vitalidad;
        return this;
    }



    @Override
    public Personaje buildPersonaje() {

        Personaje personaje = new Guerrero();
        personaje.setNombre(nombre);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        personaje.setListaHabilidades(listaHabilidades);
        ((Guerrero)personaje).setFuerza(fuerza);
        ((Guerrero)personaje).setResistencia(resistencia);
        ((Guerrero)personaje).setVitalidad(vitalidad);
        return personaje;
    }

}
