import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JugadorList  {

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

    public void doRanking(){
        List<Integer> trofeos = new ArrayList<>();
        for (Jugador j: lista){
            trofeos.add(j.getTrofeos());
        }
        Collections.sort(trofeos);
        for (int i = trofeos.size()-1; i >= 0 ; i--) {
            for (int j = 0; j < lista.size(); j++){
                if (trofeos.get(i) == lista.get(j).getTrofeos()){
                    System.out.println(lista.get(j).getNombre()+" -> "+lista.get(j).getTrofeos());
                }
            }
        }
    }

}
