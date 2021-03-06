package ejercicio4;

import java.util.Comparator;

public class Pelicula {

    //Atributos de la clase
    private String titulo, director;
    private Integer duracion;

    //constructores
    public Pelicula() {

    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //metodos get y set 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Director: " + director + " Duracion: " + duracion;
    }

    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Pelicula peli1, Pelicula peli2) { // Le pasamos dos objetos a comparar
            return peli1.getDuracion().compareTo(peli2.getDuracion()); // Los comparamos usando el get y el compareTo
        }
    };
    
    public static Comparator<Pelicula> compararDuracionDecente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli1.getDuracion().compareTo(peli2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararTituloAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDirectorAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    
    

}

//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//esto, tendremos una clase Pelicula con el titulo, director y duraci??n de la pel??cula (en
//horas). Implemente las clases y m??todos necesarios para esta situaci??n, teniendo en
//cuenta lo que se pide a continuaci??n:
//
//
//En el main deberemos tener un bucle que crea un objeto Pelicula pidi??ndole al
//usuario todos sus datos y guard??ndolos en el objeto Pelicula.
//Despu??s, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
//quiere crear otra Pelicula o no.
//Despu??s de ese bucle realizaremos las siguientes acciones:
//??? Mostrar en pantalla todas las pel??culas.
//??? Mostrar en pantalla todas las pel??culas con una duraci??n mayor a 1 hora.
//??? Ordenar las pel??culas de acuerdo a su duraci??n (de mayor a menor) y mostrarlo
//en pantalla.
//??? Ordenar las pel??culas de acuerdo a su duraci??n (de menor a mayor) y mostrarlo
//en pantalla.
//??? Ordenar las pel??culas por titulo, alfab??ticamente y mostrarlo en pantalla.
//??? Ordenar las pel??culas por director, alfab??ticamente y mostrarlo en pantalla.
