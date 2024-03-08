package co.edu.uniquindio.poo;

import java.util.List;

public class DirectorPersonaje {
    private BuilderPersonaje builderPersonaje;
    private BuilderMago builderMago;
    private BuilderArquero builderArquero;
    private BuilderGuerrero builderGuerrero;
    

    public DirectorPersonaje(BuilderPersonaje builderPersonaje){
        this.builderPersonaje = builderPersonaje;
    }

    public Personaje buildPersonaje(String nombre, String descripcion, String apodo, double dineroInicial, List<String> listaHabilidades){
        //Metodos para construir el personaje
        builderPersonaje.buildNombre(nombre);
        builderPersonaje.buildDescripcion(descripcion);
        builderPersonaje.buildApodo(apodo);
        builderPersonaje.buildDineroInicial(dineroInicial);
        builderPersonaje.buildHabilidades(listaHabilidades);
        return builderPersonaje.buildPersonaje();
    }

    public Personaje buildMago(String nombre, String descripcion, String apodo, double dineroInicial, List<String> listaHabilidades, int inteligencia, int sabiduria, int energiaMagica){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        builderMago.buildInteligencia(inteligencia);
        builderMago.buildSabiduria(sabiduria);
        builderMago.buildEnergiaMagica(energiaMagica);
        return builderMago.buildPersonaje();
    
    }

    public Personaje buildArquero(String nombre, String descripcion, String apodo, double dineroInicial, List<String> listaHabilidades, int destreza, int agilidad, int precision){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        builderArquero.buildDestreza(destreza);
        builderArquero.buildAgilidad(agilidad);
        builderArquero.buildPrecision(precision);
        return builderArquero.buildPersonaje();
    }
//Crear un builder general, de allí hacer el cast que se menciona a continuacón
//Crear un cast para que el director sepa que tipo de  personaje va a construir
    
    public Personaje buildGuerrero(String nombre, String descripcion, String apodo, double dineroInicial, List<String> list, int fuerza, int resistencia, int vitalidad){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, list);
        builderGuerrero.buildFuerza(fuerza);
        builderGuerrero.buildResistencia(resistencia);
        builderGuerrero.buildVitalidad(vitalidad);
        return builderGuerrero.buildPersonaje();
    }
}