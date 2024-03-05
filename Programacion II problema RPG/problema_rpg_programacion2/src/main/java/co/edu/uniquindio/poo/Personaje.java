package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Personaje{
    private String nombre;
    private String descripcion;
    private String apodo;
    private double dineroInicial;
    private ArrayList<String> listaHabilidades;
  


    /*public Personaje(String nombre, String descripcion, String apodo, double dineroInicial) {
        assert dineroInicial >= 0: "El dinero no puede ser negativo";
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.listaHabilidades = listaHabilidades;
    }*/

    public Personaje(){
        this.listaHabilidades = new ArrayList<>();
    }


    

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getApodo() {
        return apodo;
    }


    public void setApodo(String apodo) {
        this.apodo = apodo;
    }


    public double getDineroInicial() {
        return dineroInicial;
    }


    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }




    public ArrayList<String> getListaHabilidades() {
        return listaHabilidades;
    }




    public void setListaHabilidades(ArrayList<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }
}
