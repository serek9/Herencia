public class Main {
    public static void main(String[] args) {
        CartaEstructura muro = new CartaEstructura("Muro", 2, 4, 4);
        CartaEstructura torre = new CartaEstructura("Torre", 4, 6, 6);
        CartaEstructura barricada = new CartaEstructura("Barricada", 4,6,6);
        CartaHechizo mago = new CartaHechizo("Mago", 6, 8, "Ataque", 8);
        CartaHechizo bruja = new CartaHechizo("Bruja", 6,8,"Ataque", 8);
        CartaHechizo pocion = new CartaHechizo("Pocion", 4, 6,"Defensa", 6);
        CartaTropa espartano = new CartaTropa("Espartano", 2,4,4);
        CartaTropa arquero = new CartaTropa("Arquero", 4, 6,6);
        CartaTropa gigante = new CartaTropa("Gigante", 6, 8, 8);

        Jugador j1 = new Jugador("Sergio", "sergio", 0,);
        Jugador j2 = new Jugador("Alberto", "alberto", 0,);
        Jugador j3 = new Jugador("Nando", "nando", 0, );
        Jugador j4 = new Jugador("Larry", "larry", 0, );
    }
}
