public class CartaHechizo extends Carta{
    private String modo;
    private int alcance;

    public CartaHechizo(String nombre, int coste, int vida, String modo, int alcance) {
        super(nombre, coste, vida);
        this.modo = modo;
        this.alcance = alcance;
    }

    public String getModo() {return modo;}

    public void setModo(String modo) {this.modo = modo;}

    public int getAlcance() {return alcance;}

    public void setAlcance(int alcance) {this.alcance = alcance;}
}
