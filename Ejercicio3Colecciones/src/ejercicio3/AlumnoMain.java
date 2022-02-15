package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AlumnoMain {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Alumno> alumnos = new ArrayList<>(); //creo la lista

        String respuesta = "";

        do {

            Alumno a1 = new Alumno(); // creo un objeto nuevo en cada vuelta

            System.out.println("Ingrese el nombre del alumno:");
            String nombre = teclado.next();

            System.out.println("ingrese la primera nota:");
            int nota1 = teclado.nextInt();

            System.out.println("ingrese la segundo nota:");
            int nota2 = teclado.nextInt();

            System.out.println("ingrese la tercera nota");
            int nota3 = teclado.nextInt();

            //ahora seteo los atributos de la clase Alumno
            a1.setNombre(nombre);
            a1.setNota1(nota1);
            a1.setNota2(nota2);
            a1.setNota3(nota3);

            alumnos.add(a1); // agregamos el objeto a1 que llenamos a la lista de alumnos

            System.out.println("Quiere ingresar otro alumno");
            respuesta = teclado.next();

        } while (respuesta.equalsIgnoreCase("si"));
        
        //muestro la lista
        for (Alumno alumno : alumnos) {
            
            System.out.println(alumno);
        }
        
        //Pregunto que alumno quiero saber la nota final
        System.out.println("nombre de alumno que desea obtener su nota:");
        String nombreAlumno = teclado.next();
        
        for (Alumno alumno : alumnos) {
            
            if(alumno.getNombre().equalsIgnoreCase(nombreAlumno)){
                System.out.println("La nota final del alumno: " + nombreAlumno + " es: " + alumno.notaFinal());
            }
        }
        
        

    }

}
