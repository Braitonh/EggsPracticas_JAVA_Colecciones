
package ejercicio3v2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;  

public class AlumnoMain {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Integer> notas = new ArrayList<>();
        
        String respuesta;
        int bandera,nota;
        
        do {
            
            System.out.println("Ingrese nombre del alumno:");
            String nombre = teclado.next();
            
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota del examen " + (i+1));
                nota = teclado.nextInt();
                notas.add(nota);
            }
            Alumno alumnonew = new Alumno(nombre,notas); // creo un nuevo objeto en cada vuelta del do/while
            
            alumnos.add(alumnonew); //agregamos el objeto alumnonew al arraylist alumnos 
            
            System.out.println("quiere ingresar otro alumno");
            respuesta=teclado.next();
            
            if (respuesta.equalsIgnoreCase("si")){
                bandera=1;
            }else{
                bandera=0;
            }
           
        } while (bandera==1);
        
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
        
        System.out.println("Ingrese el nombre del alumno a buscar");
        String nombreAlumno = teclado.next();
        
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombreAlumno)){
                alumno.notaFinal();
            }
            
        }
        
    }
    
}
