package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer los datos desde un archivo de texto
public class GestorDatos {

    // Método que recibe la ruta del archivo y retorna una lista de Tours
    public ArrayList<Tour> cargarTour(String rutaArchivo) {

        // Lista dinámica donde se almacenarán los tours
        ArrayList<Tour> listaTour = new ArrayList<>();

        try {
            // Se abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

            // Lectura linea por linea
            String linea;

            // Se lee el archivo línea por línea
            while ((linea = lector.readLine()) != null) {

                // Se separa la línea usando punto y coma ;
                String[] partes = linea.split(";");

                // Se valida que la línea tenga 3 datos
                if (partes.length == 3) {

                    // Se convierten los datos al tipo correspondiente
                    int duracionHoras = Integer.parseInt(partes[0]);
                    String lugar = partes[1];
                    String dificultad = partes[2];

                    // Se crea un objeto Tour con los datos leídos
                    Tour tour = new Tour(duracionHoras, lugar, dificultad);

                    // Se agrega el objeto a la lista
                    listaTour.add(tour);
                }
            }

            // Se cierra el lector
            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Se retorna la lista con los Tours cargados
        return listaTour;
    }
}
