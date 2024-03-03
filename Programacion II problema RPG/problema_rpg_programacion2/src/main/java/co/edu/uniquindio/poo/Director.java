package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Director {
    private BuilderPersonaje builder;

    public Director(BuilderPersonaje builder){
        this.builder = builder;}

    public void build(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades){

        builder.buildNombre(nombre);
        builder.buildDescripcion(descripcion);
        builder.buildApodo(apodo);
        builder.buildDineroInicial(dineroInicial);
        builder.buildHabilidades(listaHabilidades);}
}