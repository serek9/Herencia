public class CartaTropa extends Carta {
    private int ataque;

    public CartaTropa(String nombre, int coste, int vida, int ataque) {
        super(nombre, coste, vida);
        this.ataque = ataque;
    }

    public int getAtaque() {return ataque;}

    public void setAtaque(int ataque) {this.ataque = ataque;}
}
