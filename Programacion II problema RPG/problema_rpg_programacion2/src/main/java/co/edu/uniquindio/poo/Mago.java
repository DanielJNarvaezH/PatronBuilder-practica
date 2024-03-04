package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Mago extends Personaje{
    private int inteligencia;
    private int sabiduria;
    private int  energiaMagica;

    public Mago(String nombre, String descripcion, String apodo, double dineroInicial, int inteligencia, int sabiduria, int energiaMagica) {
        super(nombre, descripcion, apodo, dineroInicial);
        assert inteligencia > 0 && sabiduria > 0 && energiaMagica > 0 : "Error: Las habilidades deben ser mínimo 1";
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;

    }

   

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
     /*El Mago está cumpliendo con el principio de SRP, al igual que todos, 
    ya que el jugador es responsable de cumplir el rol de mago y esa es su única responsabilidad.
    Al mismo tiempo todas las clases están cumpliendo el principio de OCP, ya que están abiertas 
    para la extensión, pero no para la modificación.
*/
  
    
    }

