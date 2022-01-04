package filmoteca;

public class Main {
    /*
    1. Crea dentro de un package de nombre "actividad09CAM.filmoteca" un
    programa para gestionar información sobre películas almacenando la información en MySQL.
    (X) 1.1 Crear una base de datos con una tabla Película que almacene los siguientes campos:
        - título
        - director
        - país
        - duración
        - género
        Introduce los datos de varias películas
    1.2 Crear una tabla director en la base de datos que almacene el nombre y los apellidos del director
    1.3 Modificar la tabla Película de tal manera que el campo director sea una referencia a la tabla Director.
    1.4 Crear una aplicación con interfaz gráfica que tenga una pantalla inicial con los siguientes botones:
        Insertar
        Eliminar
        Modificar película
    1.5 Para crear y modificar películas, los directores los podremos seleccionar de una lista desplegable (ComboBox)
    1.6 Insertar, eliminar, modificar director. Hay que controlar que no se puede eliminar un director que tenga películas
    1.7 Listados. La pantalla contendrá dos listas desplegables, que desde las que el usuario podrá buscar películas por director o por género.
        Si el usuario deja en blanco las dos listas desplegables, se mostrarán todas las películas
    1.8 Visualizar los datos de las películas de la base de datos. Se debe mostrar cada campo en cajas de texto. Debajo de las cajas de texto
        habrá un botón Siguiente que mostrará los datos de la siguiente película. Hay que deshabilitar este botón cuando no haya más películas que ver.
     */
    public static void main(String[] args) {
        Filmoteca film = new Filmoteca("MiFilmoteca");
        DatabaseConnector.testconnectivty();
        film.insertar(peliculasDePrueba());
        film.acciones();

    }

    public static Pelicula[] peliculasDePrueba() {
        return new Pelicula[]{
                new Pelicula(
                        "Encanto",
                        new String[]{"Byron Howard"},
                        "España",
                        84,
                        "Animación"),
                new Pelicula(
                        "Mulan",
                        new String[]{"Niki Caro"},
                        "España",
                        120,
                        "Animación"),
                new Pelicula(
                        "Vaiana",
                        new String[]{"Ron Clements", "John Musker"},
                        "España",
                        93,
                        "Animación"),
                new Pelicula(
                        "Inside Out",
                        new String[]{"Pete Docter"},
                        "España",
                        93,
                        "Animación"),
                new Pelicula(
                        "Malefica",
                        new String[]{"Niki Caro"},
                        "España",
                        120,
                        "Ciencia ficción"),
        };

    }

}