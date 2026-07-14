/**
 * Gestor Entidades
 */

package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {

    public GestorEntidades() {

        /**
         *  Nueva lista tipo ArrayList con poliformismo
         */
            List<Registrable> lista = new ArrayList<>();
            lista.add(new GuiaTuristico("Erling Haaland", 25, "13092303-8", "Rios", 2));
            lista.add(new Vehiculo("ABCD-22", "Yaris"));
            lista.add(new Cliente("Lionel Messi", 39, "11518274-9", "Argentina"));
            lista.add(new Colaborador("Alexis Sanchéz", 39, "9762981-1", "Selección Chilena"));

/**
 * Recorriendo la lista de elementos mediante bucle for
 */
            for (Registrable r : lista) {
                r.mostrarResumen();
/**
 * Validando el tipo real de objeto en tiempo de ejecución
 */
                if (r instanceof GuiaTuristico) {
                    System.out.println("→ El(Ella) es un Guía Turístico.\n");
                } else if (r instanceof Vehiculo) {
                    System.out.println("→ Este es un Vehículo.\n");
                } else if (r instanceof Cliente) {
                    System.out.println("→ El(Ella) es un Cliente.\n");
                } else if (r instanceof Colaborador) {
                    System.out.println("→ El(Ella) es un Colaborador externo.\n");

                }
            }
        }
    }