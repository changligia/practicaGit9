package ejercicio4.parser;

import ejercicio4.modelos.Videojuego;

import java.util.List;

public class VideojuegoParser {
    public static Videojuego[] crearArrayVideojuego(List<String> listaInput) {
        final var n = listaInput.size();
        final var arrayVideojuego = new Videojuego[n];

        for (var i = 0; i < n; i++) {
            arrayVideojuego[i] = parserVideojuego(listaInput.get(i));
        }

        return arrayVideojuego;
    }

    private static Videojuego parserVideojuego(String dataVideojuego) {
        final var arrayString = dataVideojuego.split(",");

        final var nombre = arrayString[0];
        final var anho = Integer.parseInt(arrayString[1]);
        final var precio = Double.parseDouble(arrayString[2]);
        final var duracion = Integer.parseInt(arrayString[3]);
        final var genero = Videojuego.Genero.valueOf(arrayString[4]);
        final var empresa = Videojuego.Empresa.valueOf(arrayString[5]);

        return new Videojuego(nombre, anho, precio, duracion, genero, empresa);
    }


}
