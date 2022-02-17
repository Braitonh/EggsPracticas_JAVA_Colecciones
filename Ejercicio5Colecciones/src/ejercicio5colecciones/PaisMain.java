
package ejercicio5colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PaisMain {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        HashSet<String> paisesSet  = new HashSet<>();
        
        String respuesta = "";
        int bandera;
        
        do {
            
            System.out.println("ingrese un pais");
            String pais = teclado.next();
            paisesSet.add(pais);
            
            System.out.println("Quiere ingresar otro pais?");
            respuesta = teclado.next();
            
            if (respuesta.equalsIgnoreCase("si")){
                bandera = 1;
            }else{
                bandera = 0;
            }
            
        } while (bandera==1);
        
        for (String paise : paisesSet) {
            System.out.println(paise);
        }
        
        //ordeno mi Set/Conjunto
        ArrayList<String> paisesLista = new ArrayList<>();
        Collections.sort(paisesLista);
        
        for (String aux : paisesLista) {
            System.out.println(aux);
        }
        
        System.out.println("Ingrese un pais a eliminar");
        String paisEliminar;
        paisEliminar = teclado.next();
        
        //Removemos el pais buscado
        Iterator<String> iterator = paisesSet.iterator();
        while (iterator.hasNext()){
            if(iterator.equals(paisEliminar)) //Consultar porque si no pongo next() se crea un bucle infinito
                iterator.remove();
        }
        
        for (String aux : paisesSet) {
            System.out.println(aux);
        }
        
      
        
        
        
        
        
        
    }
    
}

//Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//guardará el país en el conjunto y después se le preguntará al usuario si quiere
//guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//guardados en el conjunto.
//Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//recordar como se ordena un conjunto.
//Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
//se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
//ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
//se le informará al usuario.
