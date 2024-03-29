package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;


public class BuilderMago implements BuilderPersonaje{
    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private int inteligencia,sabiduria, energiaMagica;
    private List<String> listaHabilidades;

    public BuilderMago() {
        this.listaHabilidades = new ArrayList<>();
      
    }

    @Override
    public void buildNombre(String nombre) {
        this.nombre = nombre;}

    @Override
    public void buildDescripcion(String descripcion) {
        this.descripcion = descripcion;}

    @Override
    public void buildApodo(String apodo) {
        this.apodo = apodo;}

    @Override
    public void buildDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;}

    @Override
    public void buildHabilidades(List<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;}

    public BuilderMago buildInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
        return this;}

    public BuilderMago buildSabiduria(int sabiduria){
        this.sabiduria= sabiduria;
        return this;}
    
    public BuilderMago buildEnergiaMagica(int energiaMagica){
        this.energiaMagica = energiaMagica;
        return this;}

    @Override
    public Personaje buildPersonaje() {

        Personaje personaje = new Mago();
        personaje.setNombre(nombre);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        personaje.setListaHabilidades(listaHabilidades);
        ((Mago)personaje).setInteligencia(inteligencia);
        ((Mago)personaje).setSabiduria(sabiduria);
        ((Mago)personaje).setEnergiaMagica(energiaMagica);
        

        return personaje;
    }

}

//Acá en el personaje es que el constructor del producto coincida con los datos del builder, por eso no tendía a funcionar, porque hacían falta unos datos

