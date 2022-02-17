package ejercicio4;

import com.sun.javafx.css.Combinator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Service {

    private ArrayList<Pelicula> peliculas;
    private Scanner cin;

    public Service() {
        this.peliculas = new ArrayList<>();
        this.cin = new Scanner(System.in);
    }

    public void crearPelicula(String titulo, String director, Integer duracion) {
        Pelicula pelicula = new Pelicula();

        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setDuracion(duracion);

        agregarPelicula(pelicula);
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public void mostarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostarPeliculasLargas() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }
    
     

    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli1.getDuracion().compareTo(peli2.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararDuracionDecentende = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli2.getDuracion().compareTo(peli1.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararTituloAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Pelicula> compararDirectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };

    public void ingresarPelicula() {
        System.out.println("Ingrese titulo de la pelicula:");
        String titulo = cin.next();

        System.out.println("Ingrese director de la pelicula");
        String director = cin.next();

        System.out.println("Ingrese la duracion de la pelicula");
        Integer duracion = cin.nextInt();

        crearPelicula(titulo, director, duracion);
    }

    public void procesamientoPrincipal() {
        String respuesta = "";

        do {

            if (this.peliculas.isEmpty()) {
                ingresarPelicula();
            } else {
                System.out.println("Desea ingresar otra pelicula");
                respuesta = cin.next();

                switch (respuesta.toLowerCase()) {
                    case "si": {
                        ingresarPelicula();
                    }
                    break;

                    case "no": {
                        System.out.println("Operacion Terminada");
                    }
                    break;

                    default: {
                        System.out.println("Opcion invalida");
                    }
                    break;
                }

            }

        } while (!respuesta.equals("no"));

    }

    public void procesamientoSecundario() {

        System.out.println("La lista de pelicula es:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Ordenando...");

        peliculas.sort(compararDuracionAscendente);
        System.out.println("Lista ordenada de menor a mayor");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Ordenando...");
        peliculas.sort(compararDuracionDecentende);
        System.out.println("Lista ordenada de mayor a menor");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Ordenando...");
        peliculas.sort(compararTituloAlfabeticamente);
        System.out.println("Lista ordenada por titulos alfabeticamente");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Ordenando...");
        peliculas.sort(compararDirectorAlfabeticamente);
        System.out.println("Lista ordenada por director alfabeticamente");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Ordenando...");
        mostarPeliculasLargas();

    }

}

//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
//horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
//cuenta lo que se pide a continuación:
//
//
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
//quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
