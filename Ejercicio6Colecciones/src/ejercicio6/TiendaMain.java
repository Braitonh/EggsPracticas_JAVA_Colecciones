package ejercicio6;

import java.util.Scanner;

public class TiendaMain {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Tienda servicioTienda = new Tienda();
        int respuesta;

        do {
            System.out.println("");
            System.out.println("Bienvenido. Ingrese una opcion:");
            System.out.println("1: Mostrar Productos");
            System.out.println("2: Agregar producto");
            System.out.println("3: Modificar precio");
            System.out.println("4: Eliminar producto");
            System.out.println("0: Para salir");
            respuesta = cin.nextInt();

            switch (respuesta) {
                case 1: {
                    System.out.println("La lista de productos es:");
                    servicioTienda.mostrarProducto();
                }
                break;
                
                case 2: {
                    servicioTienda.agregarProducto();
                }
                break;
                
                case 3:{
                    servicioTienda.modificarProducto();
                }
                break;
                
                case 4:{
                    servicioTienda.eliminarProducto();
                }
                break;
                
                case 0:{
                    System.out.println("Saliendo....");
                }break;
                
                default:{
                    System.out.println("Opcion invalida");
                }
                break;
            }

        } while (respuesta!=0);

    }

}

//Se necesita una aplicación para una tienda en la cual queremos almacenar los
//distintos productos que venderemos y el precio que tendrán. Además, se necesita
//que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
