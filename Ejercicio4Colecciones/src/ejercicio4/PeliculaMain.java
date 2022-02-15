package ejercicio4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PeliculaMain {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Pelicula> peliculas = new ArrayList<>(); // creo la liste de peliculas

        String respuesta = "";

        do {

            Pelicula agregarPelicula = new Pelicula(); // creo un objeto cada vez que se repita el bucle

            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = teclado.next();

            System.out.println("Ingrese el directer de la pelicula");
            String director = teclado.next();

            System.out.println("Ingrese la duracion de la pelicula");
            int duracion = teclado.nextInt();

            //agrego al objeto agregarPelicula los datos: titulo , director y duracion
            agregarPelicula.setTitulo(titulo);
            agregarPelicula.setDirector(director);
            agregarPelicula.setDuracion(duracion);

            peliculas.add(agregarPelicula); // agrege a la liste pelicula el objeto (agregarPelicula)

            System.out.println("Quiere ingresar otra pelicula");
            respuesta = teclado.next();

        } while (respuesta.equalsIgnoreCase("si"));

        //muestro la lista peliculas
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        //muestro la lista de peliculas con una duracion mayor a 1 hora
        System.out.println("*************************");
        System.out.println("La lista de peliculas con una duracion de mas de 1 hora son:");

        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() > 10) {
                System.out.println(pelicula);
            }
        }

        System.out.println("*************************");

        //Ordeno la lista de menor a mayor duracion
        peliculas.sort(Pelicula.compararDuracionAscendente);
        
        System.out.println("La lista de peliculas ordenada de menor a mayor duracion");
        //Muestro la lista ordenada
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("********************");
        
        peliculas.sort(Pelicula.compararDuracionDecente.reversed());
        System.out.println("La lista de peliculas ordenadas de mayor a menor duracion");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("*****************");
        
        peliculas.sort(Pelicula.compararTituloAscendente);
        System.out.println("La lista de peliculas ordenadas alfabeticamente el titulo");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("*********************");
        
        peliculas.sort(Pelicula.compararDirectorAscendente);
        System.out.println("La lista de peliculas ordenadas alfabeticamente de director");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        

    }

}
