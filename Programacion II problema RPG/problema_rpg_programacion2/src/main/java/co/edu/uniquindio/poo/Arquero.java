package co.edu.uniquindio.poo;

public class Arquero extends Personaje{
    private int destreza;
    private int agilidad;
    private int precision;

    public Arquero(String nombre, String descripcion, String apodo, double dineroInicial, int destreza, int agilidad, int precision) {
        super(nombre, descripcion, apodo, dineroInicial);
        assert destreza  > 0 && agilidad > 0 && precision > 0 : "Error: Las habilidades deben ser mínimo 1";
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;}

    public int getDestreza() {
        return destreza;}

    public void setDestreza(int destreza) {
        this.destreza = destreza;}

    public int getAgilidad() {
        return agilidad;}

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;}

    public int getPrecision() {
        return precision;}

    public void setPrecision(int precision) {
        this.precision = precision;}
}
