public class Carta {
    private String nombre;
    private int coste;
    private int vida;

    public Carta(String nombre, int coste, int vida) {
        this.nombre = nombre;
        this.coste = coste;
        this.vida = vida;
    }

    public Carta(){
        
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getCoste() {return coste;}
    public void setCoste(int coste) {this.coste = coste;}

    public int getVida() {return vida;}
    public void setVida(int vida) {this.vida = vida;}

    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombre + '\'' +
                ", coste=" + coste +
                ", vida=" + vida +
                '}';
    }
}
