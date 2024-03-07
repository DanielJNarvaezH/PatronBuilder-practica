package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class DirectorPersonaje {
    private BuilderPersonaje builderPersonaje;

    public DirectorPersonaje(BuilderPersonaje builderPersonaje){
        this.builderPersonaje = builderPersonaje;
    }

    public Personaje buildPersonaje(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades){
        //Metodos para construir el personaje
        builderPersonaje.buildNombre(nombre);
        builderPersonaje.buildDescripcion(descripcion);
        builderPersonaje.buildApodo(apodo);
        builderPersonaje.buildDineroInicial(dineroInicial);
        builderPersonaje.buildHabilidades(listaHabilidades);
        return builderPersonaje.buildPersonaje();
    }

    public Personaje builderMago(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int inteligencia, int sabiduria, int energiaMagica){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        builderM.buildInteligencia(inteligencia);
        builderM.buildSabiduria(sabiduria);
        builderM.buildEnergiaMagica(energiaMagica);
        return builderM.buildPersonaje();
    
    }

    public Personaje builderArquero(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int destreza, int agilidad, int precision){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        builderA.buildDestreza(destreza);
        builderA.buildAgilidad(agilidad);
        builderA.buildPrecision(precision);
        return builderA.buildPersonaje();
    }
//Crear un builder general, de allí hacer el cast que se menciona a continuacón
//Crear un cast para que el director sepa que tipo de  personaje va a construir
    public Personaje builderGuerrero(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int fuerza, int resistencia, int vitalidad){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        builderG.buildFuerza(fuerza);
        builderG.buildResistencia(resistencia);
        builderG.buildVitalidad(vitalidad);
        return builderA.buildPersonaje();
    }
}