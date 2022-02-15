
package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Tienda {
    
    private HashMap<String, Integer> productos = new HashMap();
    
    //constructor

    public Tienda() {
        
    }
    
    public Tienda(HashMap<String, Integer> productos){
        this.productos = productos;
    }
    
    //Get y Set

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Integer> productos) {
        this.productos = productos;
    }
    
    //metodos
    
    public void agregarProducto (){
        Scanner cin = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = cin.next();
        
        System.out.println("Ingrese precio del producto:");
        int precioProducto = cin.nextInt();
        
        productos.put(nombreProducto, precioProducto);
        
    }
    
    public void modificarProducto(){
        Scanner cin = new Scanner (System.in);
        
        System.out.println("ingrese el nombre del producto a modificar");
        String nombreProducto = cin.next();
        
        System.out.println("Ingrese precio modificado");
        int precioProducto = cin.nextInt();
        
        productos.replace(nombreProducto, precioProducto);
        
    }
    
    public void eliminarProducto(){
        Scanner cin = new Scanner (System.in);
        
        System.out.println("ingrese el nombre del producto a eleiminar");
        String nombreProducto = cin.next();
        
        productos.remove(nombreProducto);
    }
    
    public void mostrarProducto(){
        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            
            System.out.println("Producto: " + key + " Precio: " + value);
        }
    }
    
    
    
    
    
    
}
