package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuilderArquero implements BuilderPersonaje {

    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private int destreza, agilidad, precision;
    private ArrayList<String> listaHabilidades;

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
    public void buildHabilidades(ArrayList<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;}

    public BuilderArquero buildDestreza(int destreza){
        this.destreza=destreza;
        return this;}

    public BuilderArquero buildAgilidad(int agilidad){
        this.agilidad=agilidad;
        return this;}
    
    public BuilderArquero buildPrecision(int precision){
        this.precision=precision;
        return  this;}

    @Override
    public Personaje buildPersonaje() {
        return new Arquero(nombre, descripcion, apodo, dineroInicial, destreza, agilidad, precision);}
}//Acá en el personaje es que el constructor del producto coincida con los datos del builder, por eso no tendía a funcionar, porque hacían falta unos datos
