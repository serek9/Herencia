import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private String password;
    private int trofeos;
    private ArrayList cartas;

    public Jugador(String nombre, String password, int trofeos, ArrayList cartas) {
        this.nombre = nombre;
        this.password = password;
        this.trofeos = trofeos;
        this.cartas = cartas;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public int getTrofeos() {return trofeos;}

    public void setTrofeos(int trofeos) {this.trofeos = trofeos;}

    public ArrayList getCartas() {return cartas;}

    public void setCartas(ArrayList cartas) {this.cartas = cartas;}

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", trofeos=" + trofeos +
                ", cartas=" + cartas +
                '}';
    }
}
