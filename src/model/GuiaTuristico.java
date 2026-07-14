package model;

/**
 * Clase con herencia GuiaTuristico y que utiliza interfaz Registrable
 */
public class GuiaTuristico extends Persona implements Registrable {

    /**
     * Atributos propios de la clase GuiaTuristico
     */
    private String tourGuia;
    private int mesesServicio;

    /**
     *  Contructor
     * @param nombre nombre persona
     * @param edad edad persona
     * @param rut rut persona
     * @param tourGuia Tour especifico del guía
     * @param mesesServicio meses servicio guía
     */
    public GuiaTuristico(String nombre, int edad, String rut, String tourGuia, int mesesServicio) {
        super(nombre, edad, rut);
        this.tourGuia = tourGuia;
        this.mesesServicio = mesesServicio;
    }

    /**
     * Getters y Setters
     *
     */
    public String getTourGuia() {
        return tourGuia;
    }

    public void setTourGuia(String tourGuia) {
        this.tourGuia = tourGuia;
    }

    public int getMesesServicio() {
        return mesesServicio;
    }

    public void setMesesServicio(int mesesServicio) {
        this.mesesServicio = mesesServicio;
    }

    /**
     * Metodo toString()
     *
     */
    @Override
    public String toString() {
        return "Guía Turístico:\n"
                + "\nNombre: " + getNombre()
                + "\nEdad: " +getEdad()
                +"\nRut: " +getRut()
                + "\nTour Guía: " + tourGuia
                +"\nMeses Servicio: " + mesesServicio
                +"\n";
    }

    /**
     * Implementación del metodo mostrarResumen() de la interfaz Registrable
     */
    @Override
    public void mostrarResumen() {
        System.out.println("Nombre: " +getNombre());
        System.out.println("Edad: " +getEdad());
        System.out.println("Rut: " +getRut());
        System.out.println("Meses de Servicio: " + mesesServicio);
    }
}
