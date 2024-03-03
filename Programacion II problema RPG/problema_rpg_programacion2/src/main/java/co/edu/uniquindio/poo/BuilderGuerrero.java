package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class BuilderGuerrero implements BuilderPersonaje {
    private String nombre, descripcion, apodo;
    private double dineroInicial;
    private int fuerza, resistencia, vitalidad;
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

    public BuilderGuerrero buildFuerza(int fuerza){
        this.fuerza=fuerza;
        return this;}

    public BuilderGuerrero buildResistencia(int resistencia){
        this.resistencia=resistencia;
        return this;}

    public BuilderGuerrero buildVitalidad(int vitalidad){
        this.vitalidad=vitalidad;
        return this;}

    @Override
    public Personaje buildPersonaje() {
        return new Guerrero(nombre, descripcion, apodo, dineroInicial, fuerza, resistencia, vitalidad);}
}
