package ejercicio3;

import utilities.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var fileInput = new File("src/ejercicio4.input/notas.csv");
        final var data = FileManager.leerFile(fileInput);
        final var listaSalonAlto = new ArrayList<String>();
        final var listaSalonMedio = new ArrayList<String>();
        final var listaSalonBajo = new ArrayList<String>();

        rellenarListaNotas(data, listaSalonAlto, listaSalonMedio, listaSalonBajo);
        System.out.printf("Los alumnos del salon MEDIO son:  %s%n", listaSalonMedio);
    }

    private static Nota calificarAlumno(int nota) {
        if (nota >= 16) {
            return Nota.ALTO;
        } else if (nota >= 10) {
            return Nota.MEDIO;
        } else {
            return Nota.BAJO;
        }
    }

    private enum Nota {
        ALTO,
        MEDIO,
        BAJO
    }

    private static void rellenarListaNotas(List<String> data, List<String> listaSalonAlto, List<String> listaSalonMedio,
                                           List<String> listaSalonBajo) {
        for (var alumno : data) {
            final var arrayData = alumno.split(",");
            final var nombre = arrayData[0];
            final var nota = Integer.parseInt(arrayData[1]);
            final var salon = calificarAlumno(nota);
            switch (salon) {
                case ALTO -> listaSalonAlto.add(nombre);
                case MEDIO -> listaSalonMedio.add(nombre);
                case BAJO -> listaSalonBajo.add(nombre);
            }
        }
    }
}
