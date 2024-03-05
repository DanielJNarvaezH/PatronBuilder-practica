package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class DirectorPersonaje {
    private BuilderMago builderM;
    private BuilderArquero builderA;
    private BuilderGuerrero builderG;

    public DirectorPersonaje(BuilderMago builderM, BuilderArquero builderA, BuilderGuerrero builderG){

        this.builderM = builderM;
        this.builderA = builderA;
        this.builderG = builderG;
    }

    public Personaje builderMago(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int inteligencia, int sabiduria, int energiaMagica){

        builderM.buildNombre(nombre);
        builderM.buildDescripcion(descripcion);
        builderM.buildApodo(apodo);
        builderM.buildDineroInicial(dineroInicial);
        builderM.buildHabilidades(listaHabilidades);
        builderM.buildInteligencia(inteligencia);
        builderM.buildSabiduria(sabiduria);
        builderM.buildEnergiaMagica(energiaMagica);
        return builderM.buildPersonaje();
    
    }

    public Personaje builderArquero(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int destreza, int agilidad, int precision){
        builderA.buildNombre(nombre);
        builderA.buildDescripcion(descripcion);
        builderA.buildApodo(apodo);
        builderA.buildDineroInicial(dineroInicial);
        builderA.buildHabilidades(listaHabilidades);
        builderA.buildDestreza(destreza);
        builderA.buildAgilidad(agilidad);
        builderA.buildPrecision(precision);
        return builderA.buildPersonaje();
    }

    public Personaje builderGuerrero(String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int fuerza, int resistencia, int vitalidad){
        builderG.buildNombre(nombre);
        builderG.buildDescripcion(descripcion);
        builderG.buildApodo(apodo);
        builderG.buildDineroInicial(dineroInicial);
        builderG.buildHabilidades(listaHabilidades);
        builderG.buildFuerza(fuerza);
        builderG.buildResistencia(resistencia);
        builderG.buildVitalidad(vitalidad);
        return builderA.buildPersonaje();
    }
}