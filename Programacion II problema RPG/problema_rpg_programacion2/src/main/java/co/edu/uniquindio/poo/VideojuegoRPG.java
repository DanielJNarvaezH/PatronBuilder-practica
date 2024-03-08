package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;

public class VideojuegoRPG {
    private String nombre;
    private Collection<Jugador> listaJugadores;
    private static VideojuegoRPG instance;

    public VideojuegoRPG(String nombre) {
        assert !nombre.isEmpty() : "El nombre del videojuego no puede estar vacío";
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
    }

    public static VideojuegoRPG getInstance(String nombre) {
        if (instance == null) {
            instance = new VideojuegoRPG(nombre);
        }
        return instance;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Collection<Jugador> getEnfrentamientos() {
        return Collections.unmodifiableCollection(listaJugadores);
    }

    public void registrarJugador(Jugador jugador) {
        boolean validarPersonaje= buscarJugadorPorId(jugador.getId()).isPresent();
        assert !validarPersonaje:"El nombre para el mago ha sido registrado";
        listaJugadores.add(jugador);
    }
    

    private Optional<Jugador> buscarJugadorPorId(String id) {
        Predicate<Jugador> condicion = jugador ->  jugador.getId().equals(id);
        return listaJugadores.stream().filter(condicion).findAny();
    }



}
