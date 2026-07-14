package model;

/**
 * Clase con herencia GuiaTuristico y que utiliza interfaz Registrable
 */
public class Colaborador extends Persona implements Registrable {

    /**
     * Atributo propio de la clase Colaborador
     */
    private String empresaExterna;

    /**
     * Constructor
     * @param nombre nombre persona
     * @param edad edad persona
     * @param rut rut persona
     * @param empresaExterna Empresa externa en la cual trabaja colaborador
     */
    public Colaborador(String nombre, int edad, String rut, String empresaExterna) {
        super(nombre, edad, rut);
        this.empresaExterna = empresaExterna;
    }

    /**
     * Getters y Setters
     *
     */
    public String getEmpresaExterna() {
        return empresaExterna;
    }

    public void setEmpresaExterna(String empresaExterna) {
        this.empresaExterna = empresaExterna;
    }

    /**
     * Metodo toString()
     *
     */
    @Override
    public String toString() {
        return "Colaborador Externo:\n"
                + "\nNombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nRut: " + getRut()
                + "\nEmpresa: " + empresaExterna
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
        System.out.println("Empresa: " + empresaExterna);
    }
}
