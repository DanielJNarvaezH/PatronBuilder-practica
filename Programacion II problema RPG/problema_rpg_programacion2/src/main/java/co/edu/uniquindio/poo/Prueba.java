package co.edu.uniquindio.poo;

import java.util.ArrayList;


public class Prueba {
    public static void main(String[] args) {
        BuilderPersonaje builder = new BuilderGuerrero();
        DirectorPersonaje director = new DirectorPersonaje(builder);

        // Construir un guerrero
        director.buildGuerrero("Argus","Angel de la oscuridad", "El inmortal", 10,
                            ArrayList.of("Espada Afilada", "Golpe Definitivo", "Escudo Protector"),150, 782, 1032893);
        Personaje guerrero = builder.buildPersonaje();
        System.out.println("Guerrero creado: " + guerrero);

        // Construir un mago
        builder = new BuilderMago();
        director.buildMago("Gandalf", "Mago de la luz", "Sombrero gris", 10,
                            ArrayList.of("Bola de fuego", "Rayo eléctrico", "Hechizo de curación"),
                            500, 790, 650);
        Personaje mago = builder.buildPersonaje();
        System.out.println("Mago creado: " + mago);

        // Construir un arquero
        builder = new BuilderArquero();
        director.buildArquero("Legolas", "Flechín flechín", "Arco de hielo", 10,
                          ArrayList.of("Disparo Rápido", "Flecha Venenosa", "Tiro Certero"),100, 200, 400);
        Personaje arquero = builder.buildPersonaje();
        System.out.println("Arquero creado: " + arquero);
    }

}
