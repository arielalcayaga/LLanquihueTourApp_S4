package model;

/**
 * Clase Vehiculo que utiliza interfaz Registrable
 */
public class Vehiculo implements Registrable {

    /**
     * Atributos de la clase Vehiculo
     */
    private String patente;
    private String modelo;

    /**
     * Constructor
     * @param patente patente vehiculo
     * @param modelo modelo vehiculo
     */
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    /**
     * Getters y Setters
     *
     */
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo toString()
     *
     */
    @Override
    public String toString() {
        return "Vehículo:\n"
                + "\nPatente: " + patente
                + "\nModelo: " + modelo
                +"\n";
    }

    /**
     * Implementación del metodo mostrarResumen() de la interfaz Registrable
     */
    @Override
    public void mostrarResumen() {
        System.out.println("Vehículo: " + modelo);
        System.out.println("Patente: " + patente);
    }
}