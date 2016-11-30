import java.io.Serializable;
import java.util.ArrayList;

public class JugadorList{

    public ArrayList<Jugador> lista = new ArrayList<>();

    public JugadorList() {}

    public void alta(Jugador j){
        lista.add(j);
    }

    public Jugador usuarioCorrecto(String usu, String pass){
        boolean usuC = false;
        boolean correct = false;
        for (Jugador j:lista){
            if (j.getNombre().equals(usu)){
                usuC = true;
                if (usuC){
                    if (j.getPassword().equals(pass)){
                        return j;
                    }
                }
            }
        }
        return null;
    }


}
