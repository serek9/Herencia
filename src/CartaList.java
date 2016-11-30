import java.util.ArrayList;

public class CartaList {

    public ArrayList<Carta> lista = new ArrayList<>();

    public CartaList() {}

    public void alta(Carta c){
        lista.add(c);
    }

    public Carta buscaCarta(String carta){
        for (Carta c: lista){
            if (carta.equalsIgnoreCase(c.getNombre())){
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CartaList{" +
                "lista=" + lista +
                '}';
    }

    public ArrayList<Carta> getLista() {
        return lista;
    }
}
