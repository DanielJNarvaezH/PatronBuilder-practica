package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class DirectorPersonaje {
    private BuilderPersonaje builder;

    public DirectorPersonaje(BuilderPersonaje builder){

        this.builder = builder;
    }

    public Personaje  construccion(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades){

        builder.buildNombre(nombre);
        builder.buildDescripcion(descripcion);
        builder.buildApodo(apodo);
        builder.buildDineroInicial(dineroInicial);
        builder.buildHabilidades(listaHabilidades);
        return builder.buildPersonaje();
    
    }
}