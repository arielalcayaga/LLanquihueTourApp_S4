package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Ruta del archivo de texto
        String rutaArchivo = "resources/tours.txt";

        // Se crea un objeto de la clase GestorDatos
        GestorDatos gestor = new GestorDatos();

        // Se carga la lista de tours desde el archivo
        ArrayList<Tour> tour = gestor.cargarTour(rutaArchivo);

        // Mostrar todos los Tours cargados
        System.out.println("===== CATÁLOGO COMPLETO DE TOURS DE LLANQUIHUE TOUR  =====");

        // Recorrer una lista de objetos
        for (Tour tour1 : tour) {
            System.out.println(tour1);
        }

        // Filtrar Tours de Dificultad Fácil
        System.out.println("\n===== TOURS DIFICULTAD FÁCIL=====");

        for (Tour tour1 : tour) {
            if (tour1.getDificultad().equalsIgnoreCase("Fácil")) {
                System.out.println(tour1);
            }
        }
            }
        }