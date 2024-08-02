package ejercicio4;

import ejercicio4.modelos.Videojuego;
import ejercicio4.parser.VideojuegoParser;
import utilities.FileManager;

import java.io.File;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var fileInput = new File("src/ejercicio4/input/videojuegos.csv");
        final var listaInput = FileManager.leerFile(fileInput);
        final var arrayVideojuego = VideojuegoParser.crearArrayVideojuego(listaInput);
        ordenarArray(arrayVideojuego);
        System.out.printf("El array es: %s%n", Arrays.toString(arrayVideojuego));
    }

    private static void ordenarArray(Videojuego[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getNombre().compareTo(array[j + 1].getNombre()) > 0) { //condición de desordenado
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
