package co.edu.uniquindio.poo;

import java.util.List;

public interface BuilderPersonaje {
    void buildNombre(String nombre);
    void buildDescripcion(String descripcion);
    void buildApodo(String apodo);
    void buildDineroInicial(double dineroInicial);
    void buildHabilidades(List<String> listaHabilidades);
    Personaje buildPersonaje();
}
