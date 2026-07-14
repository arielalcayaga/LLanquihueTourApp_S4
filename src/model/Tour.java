package model;

public class Tour {
    private int duracionHoras;
    private String lugar;
    private String dificultad;

    public Tour(int duracionHoras, String lugar, String dificultad) {
        this.duracionHoras = duracionHoras;
        this.lugar = lugar;
        this.dificultad = dificultad;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Tour:" +
                "\nDuracíon en Horas: " + duracionHoras +
                "\nLugar: " + lugar +
                "\nDificultad: " + dificultad +
                "\n";
    }
}
