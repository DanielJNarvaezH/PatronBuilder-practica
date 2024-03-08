package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Personaje{
    private String nombre;
    private String descripcion;
    private String apodo;
    private double dineroInicial;
    private List<String> listaHabilidades;
  


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



    public List<String> getListaHabilidades() {
        return listaHabilidades;
    }




    public void setListaHabilidades(List<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }
}
