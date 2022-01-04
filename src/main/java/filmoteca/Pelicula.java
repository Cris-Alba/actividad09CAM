package filmoteca;

import java.util.Calendar;

public class Pelicula {
    private int id;
    private String titulo;
    private String[] directores;
    private String pais;
    private int duracion;
    private String genero;


    public Pelicula(String titulo, String[] directores, String pais, int duracion, String genero) {
        this.titulo = titulo;
        this.directores = directores;
        this.pais = pais;
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getDirectores() {
        return directores;
    }

    public String getDirectores(int index) {
        return directores[index];
    }

    public void setDirectores(String[] directores) {
        this.directores = directores;
    }

    public void setDirectores(int index, String director) {
        this.directores[index] = director;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        String listaDirectores = "";

        for (String director : this.directores) {
            listaDirectores += "   " + director + "\n";
        }

        return String.format(
                "--[Película]-----------\n" +
                        "Título: %s\n" +
                        "Directores:\n%s" +
                        "Pais: %s\n" +
                        "Duración: %s\n" +
                        "Género: %s\n" +
                        "-----------------------\n",
                this.titulo, listaDirectores, this.pais, this.duracion, this.genero);

    }
}
