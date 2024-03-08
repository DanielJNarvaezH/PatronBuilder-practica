package co.edu.uniquindio.poo;

import java.util.List;


public class Prueba {
    public static void main(String[] args) {
        BuilderPersonaje builderGuerrero = new BuilderGuerrero();
        BuilderPersonaje builderMago = new BuilderMago();
        BuilderPersonaje builderArquero = new BuilderArquero();
        DirectorPersonaje directorGuerrero = new DirectorPersonaje(builderGuerrero);
        DirectorPersonaje directorMago = new DirectorPersonaje(builderMago);
        DirectorPersonaje directorArquero = new DirectorPersonaje(builderArquero);


        // Construir un guerrero
        directorGuerrero.buildGuerrero("Argus","Angel de la oscuridad", "El inmortal", 10,
                            List.of("Espada Afilada", "Golpe Definitivo", "Escudo Protector"),150, 782, 1032893);
        Personaje guerrero = builderGuerrero.buildPersonaje();
        System.out.println("Guerrero creado: " + guerrero);

        directorMago.buildMago("Gandalf", "Mago de la luz", "Sombrero gris", 10,
                            List.of("Bola de fuego", "Rayo eléctrico", "Hechizo de curación"),
                            500, 790, 650);
        Personaje mago = builderMago.buildPersonaje();
        System.out.println("Mago creado: " + mago);

        // Construir un arquero
        directorArquero.buildArquero("Legolas", "Flechín flechín", "Arco de hielo", 10,
                          List.of("Disparo Rápido", "Flecha Venenosa", "Tiro Certero"),100, 200, 400);
        Personaje arquero = builderArquero.buildPersonaje();
        System.out.println("Arquero creado: " + arquero);
    }

}
