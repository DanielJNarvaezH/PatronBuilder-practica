package co.edu.uniquindio.poo;

public class Mago extends Personaje{
    private int inteligencia;
    private int sabiduria;
    private int  energiaMagica;

    Mago(String nombre, String descripcion, String apodo, double dineroInicial, int inteligencia, int sabiduria, int energiaMagica) {
        super(nombre, descripcion, apodo, dineroInicial);
        assert inteligencia > 0 && sabiduria > 0 && energiaMagica > 0 : "Error: Las habilidades deben ser mínimo 1";
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;}

    public int getInteligencia() {
        return inteligencia;}

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;}

    public int getSabiduria() {
        return sabiduria;}

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;}

    public int getEnergiaMagica() {
        return energiaMagica;}

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;}
}

