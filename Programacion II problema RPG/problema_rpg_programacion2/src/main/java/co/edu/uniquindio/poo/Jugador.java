package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;

public class Jugador  {
    private String id;
    private Collection<Personaje> listaPersonajes;
    DirectorPersonaje director;

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

        return listaPersonajes.stream().filter(condicion).findAny();
    }

    public void adicionarMago( String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades, int inteligencia, int sabiduria, int energiaMagica){
        BuilderMago builder = new BuilderMago();
        director = new DirectorPersonaje(builder);
        director.buildMago(nombre, descripcion, apodo, dineroInicial, listaHabilidades, inteligencia, sabiduria, energiaMagica);
        listaPersonajes.add(builder.buildPersonaje());
    }

        public void adicionarArquero( String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades,int destreza,int agilidad, int precision){
        BuilderArquero builder = new BuilderArquero();
        director = new DirectorPersonaje(builder);
        director.buildArquero(nombre, descripcion, apodo, dineroInicial, listaHabilidades, destreza, agilidad, precision);
        listaPersonajes.add(builder.buildPersonaje());
    }
    
    public void adicionarGuerero( String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades,int fuerza,int resistencia, int vitalidad){
        BuilderGuerrero builder = new BuilderGuerrero();
        director = new DirectorPersonaje(builder);
        director.buildGuerrero(nombre, descripcion, apodo, dineroInicial, listaHabilidades, fuerza, resistencia, vitalidad);
        listaPersonajes.add(builder.buildPersonaje());
    }

}

