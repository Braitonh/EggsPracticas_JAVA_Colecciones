
package Ejercicio_1;

    import java.util.ArrayList;
    import java.util.Scanner;
    import java.util.Iterator;

public class ListasDePerros {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int bandera ;
        ArrayList<String> razasDePerro = new ArrayList<>();
        
        
        do {
            System.out.println("agregar una raza de perro");
            
            razasDePerro.add(read.next());
            
            System.out.println("Desea agregar otra raza, ingrese 1 para SI / 0 para NO");
            bandera = read.nextInt();
            
            if (bandera != 1){
                System.out.println("Saliendo.....");
            }
               
            
        } while (bandera==1);
        
        
        
        System.out.println("Mostrando la lista");
        
        System.out.println(razasDePerro);
        
        System.out.println("ingrese un perro a buscar");
        String perroBuscar = read.next();
        
        Iterator<String> iterator = razasDePerro.iterator();
        
        boolean encontroPerro = false;
        
        while (iterator.hasNext()){
            System.out.println(razasDePerro.size());
            
           
            
           
        }
        
        if (encontroPerro == true){
            System.out.println("El elemento " + perroBuscar + " estaba en la lista y se elimino");
        }else{
            System.out.println("El elemento " + perroBuscar  + " NO estaba en la lista");
        }
        
        System.out.println(razasDePerro);
        
        
        
        
        
        
        
    }
    
}

//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
//El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
//decide salir, se mostrará todos los perros guardados en el ArrayList.

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.
