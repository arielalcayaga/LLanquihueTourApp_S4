package model;

/**
 * Clase con herencia Cliente y que utiliza interfaz Registrable
 */
public class Cliente extends Persona implements Registrable {

    /**
     * Atributo propio de la clase Cliente
     */
    private String pais;

    /**
     * Constructor
     * @param nombre nombre persona
     * @param edad edad persona
     * @param rut rut persona
     * @param pais pais cliente
     */
    public Cliente(String nombre, int edad, String rut, String pais) {
        super(nombre, edad, rut);
        this.pais = pais;
    }
    /**
     * Getters y Setters
     *
     */
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo toString()
     *
     */
    @Override
    public String toString() {
        return "Cliente:\n"
                + "\nNombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nRut: " + getRut()
                + "\nPaís: " + pais
                + "\n";
    }

    /**
     * Implementación del metodo mostrarResumen() de la interfaz Registrable
     */
    @Override
    public void mostrarResumen() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Rut: " + getRut());
        System.out.println("País: " + pais);
    }
}