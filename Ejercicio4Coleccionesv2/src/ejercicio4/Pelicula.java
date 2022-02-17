
package ejercicio4;


public class Pelicula {
    
    //atributos de la clase
    private String titulo, director;
    private Integer duracion;

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    public Pelicula(){
        
    }

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

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + titulo + " Director: " + director + " Duracion: " + duracion;
    }
    
    
    
    
    
    
    
    
    
}
