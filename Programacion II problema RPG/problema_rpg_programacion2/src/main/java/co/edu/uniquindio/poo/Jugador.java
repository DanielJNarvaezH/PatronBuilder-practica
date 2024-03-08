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
    /*Aquí se puede evidenciar el principio número 3 sustitución de Liskov donde esta clase abstracta
    puede sustituir a sus clases hijas, ya que cada una de ellas son un tipo de personajes
*/


    public void adicionarPersonaje( String nombre, String descripcion, String apodo, double dineroInicial, ArrayList<String> listaHabilidades){
        BuilderMago builder = new BuilderMago();
        director = new DirectorPersonaje(builder);
        director.construccion(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        
        listaPersonajes.add(builder.buildPersonaje());
    }
}

