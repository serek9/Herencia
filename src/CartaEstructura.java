public class CartaEstructura extends Carta {
    private int defensa;

    public CartaEstructura(String nombre, int coste, int vida, int defensa) {
        super(nombre, coste, vida);
        this.defensa = defensa;
    }

    public int getDefensa() {return defensa;}

    public void setDefensa(int defensa) {this.defensa = defensa;}
}
