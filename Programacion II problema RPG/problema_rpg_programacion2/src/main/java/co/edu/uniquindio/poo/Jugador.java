package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;

public class Jugador  {
    private String id;
    private Collection<Personaje> listaPersonajes;

    public Jugador(String id) {
        assert  !id.isEmpty() : "El nombre del jugador no puede estar vacío";
        this.id = id;
        this.listaPersonajes = new ArrayList<>();}

    public String getId() {
        return id;}

    public void setId(String id) {
        this.id = id;}

    public Collection<Personaje> getEnfrentamientos() {
        return Collections.unmodifiableCollection(listaPersonajes);}

    public void registrarPersonaje(Personaje personaje) {
        boolean validarPersonaje= buscarPersonajePorNombre(personaje.getNombre()).isPresent();
        assert !validarPersonaje:"El nombre para el mago ha sido registrado";
        listaPersonajes.add(personaje);}

    private Optional<Personaje> buscarPersonajePorNombre(String nombre) {
        Predicate<Personaje> condicion = personaje ->  personaje.getNombre().equals(nombre);
        return listaPersonajes.stream().filter(condicion).findAny();}
}