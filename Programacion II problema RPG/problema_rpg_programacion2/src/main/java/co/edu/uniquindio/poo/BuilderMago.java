package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuilderMago implements BuilderPersonaje{
    private String nombre, descripcion, apodo;
    private double dineroInicial, inteligencia,sabiduria, energiaMagica;
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

    public BuilderMago builInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
        return this;
    }

    public BuilderMago buildSabiduria(int sabiduria){
        this.sabiduria= sabiduria;
        return this;
    }
    
    public BuilderMago buildEnergiaMagica(int energiaMagica){
        this.energiaMagica = energiaMagica;
        return this;
    }

    @Override
    public Personaje buildPersonaje() {
        Personaje personaje = new Mago();
        personaje.setNombre(nombre);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        personaje.setListaHabilidades(listaHabilidades);
        personaje.Mago.setInteligencia(inteligencia);
        personaje.setSabiduria(sabiduria);
        personaje.setEnergiaMagica(energiaMagica);
        return personaje;
    }

}
