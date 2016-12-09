import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    private static JugadorList jugadores = new JugadorList();
    private static CartaList cartas = new CartaList();
    public static void main(String[] args) {
        int option = 0;

        CartaEstructura muro = new CartaEstructura("Muro", 2, 4, 4); cartas.alta(muro);
        CartaEstructura torre = new CartaEstructura("Torre", 4, 6, 6); cartas.alta(torre);
        CartaEstructura barricada = new CartaEstructura("Barricada", 4,6,6); cartas.alta(barricada);
        CartaHechizo mago = new CartaHechizo("Mago", 6, 8, "Ataque", 8); cartas.alta(mago);
        CartaHechizo bruja = new CartaHechizo("Bruja", 6,8,"Ataque", 8); cartas.alta(bruja);
        CartaHechizo pocion = new CartaHechizo("Pocion", 4, 6,"Defensa", 6); cartas.alta(pocion);
        CartaTropa espartano = new CartaTropa("Espartano", 2,4,4); cartas.alta(espartano);
        CartaTropa arquero = new CartaTropa("Arquero", 4, 6,6); cartas.alta(arquero);
        CartaTropa gigante = new CartaTropa("Gigante", 6, 8, 8); cartas.alta(gigante);

        Jugador j1 = new Jugador("Sergio", "sergio", 5); jugadores.alta(j1);
        Jugador j2 = new Jugador("Alberto", "alberto", 1); jugadores.alta(j2);
        Jugador j3 = new Jugador("Nando", "nando", 3); jugadores.alta(j3);
        Jugador j4 = new Jugador("Larry", "larry", 4); jugadores.alta(j4);

        mostrarMenu();
        try {
            while (option != 4) {
                option = EntradaDatos.pedirEntero("Elige opcion:");
                mostrarMenu();
                switch (option) {
                    case 1:
                        conseguirCartas();
                        break;
                    case 2:
                        batalla();
                        break;
                    case 3:
                        obtenerRanking();
                        break;
                    case 4:
                        System.out.println("Has salido.");
                        break;
                    default:
                        System.out.println("Opción incorrecta, de 1 a 4.");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void mostrarMenu(){
        System.out.println("Opción 1. Conseguir Cartas.");
        System.out.println("Opción 2. Batalla.");
        System.out.println("Opción 3. Obtener ranking de jugadores.");
        System.out.println("Opción 4. Salir.");
    }

    public static void conseguirCartas(){
        System.out.println("CONSEGUIR CARTAS.");
        String username = EntradaDatos.pedirCadenaNoVacia("Nombre de usuario:");
        String password = EntradaDatos.pedirCadenaNoVacia("Contraseña:");
        Jugador success = jugadores.usuarioCorrecto(username, password);
        if (success !=null){
            System.out.println("Hola "+success.getNombre());
            if (success.contadorCartas()){
                System.out.println("CARTAS DISPONIBLES:");
                System.out.println(cartas.getLista());
                String carta = EntradaDatos.pedirCadenaNoVacia("Elige carta (por nombre):");
                Carta cartaSeleccionada = cartas.buscaCarta(carta);
                if (cartaSeleccionada != null) {
                    Carta existeCarta = success.getCartas().buscaCarta(cartaSeleccionada.getNombre());
                    if (existeCarta == null) {
                        success.getCartas().alta(cartaSeleccionada);
                        System.out.println("Carta añadida!");
                    }else {
                        System.out.println("Error, carta ya adquirida.");
                    }
                }
            }else {
                System.out.println("Ya no puedes añadir más cartas!");
                System.out.println("Tus cartas:");
                System.out.println(success.getCartas());
            }
        }else {
            System.out.println("Usuario incorrecto:(");
        }
    }

    public static void batalla(){
        System.out.println("BATALLA");
        System.out.println("Jugador 1");
        String username1 = EntradaDatos.pedirCadenaNoVacia("Nombre de usuario:");
        String password1 = EntradaDatos.pedirCadenaNoVacia("Contraseña:");
        System.out.println("Jugador 2");
        String username2 = EntradaDatos.pedirCadenaNoVacia("Nombre de usuario:");
        String password2 = EntradaDatos.pedirCadenaNoVacia("Contraseña:");
        Jugador success1 = jugadores.usuarioCorrecto(username1, password1);
        Jugador success2 = jugadores.usuarioCorrecto(username2, password2);
        if (success1 !=null && success2 != null){
            System.out.println("Jugador 1 elige sus cartas.");
            System.out.println(success1.getCartas());
            System.out.println("Jugador 2 elige sus cartas.");
            System.out.println(success2.getCartas());
        }else{
            System.out.println("Uno de los dos usuarios ha sido introducido incorrectamente.");
        }
    }

    public CartaList cartasBatalla(Jugador j){
        System.out.println("Elige las cartas de tu mazo:");
        System.out.println();
        return null;
    }

    public static void obtenerRanking(){
        System.out.println("RANKING");
        jugadores.doRanking();
    }
}
