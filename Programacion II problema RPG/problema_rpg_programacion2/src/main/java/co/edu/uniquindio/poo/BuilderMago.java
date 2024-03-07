package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuilderMago implements BuilderPersonaje{
    private String nombre, descripcion, apodo;
    private int dineroInicial, inteligencia,sabiduria, energiaMagica;
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

    public BuilderMago buildInteligencia(int inteligencia){
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
        personaje.setInteligencia(inteligencia);
        personaje.setSabiduria(sabiduria);
        personaje.setEnergiaMagica(energiaMagica);
        return personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(double sabiduria) {
        this.sabiduria = sabiduria;
    }

    public double getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(double energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public ArrayList<String> getListaHabilidades() {
        return listaHabilidades;
    }

    public void setListaHabilidades(ArrayList<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

}
