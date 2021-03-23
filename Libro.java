/*
    Programa realizado por: Garcia Briseno Jose Carlos
 */
package publicacion;

import java.util.ArrayList;

public class Libro extends Publicacion
{
    private String ISBN;
    private String edicion;
    private String autor;
    private ArrayList<Libro> libros;

    public Libro(String ISBN, String edicion, String autor) {
        this.ISBN = ISBN;
        this.edicion = edicion;
        this.autor = autor;
        this.libros= new ArrayList<>();
    }
    
    public String getISBN(){
     return ISBN;
    }
    
    public void setISBN(String isbn){
       ISBN = isbn;
    }
    
    public String getEdicion(){
     return edicion;
    }
    
    public void setEdicion(String ed){
        edicion = ed;
    }
    
     public String getAutor(){
     return autor;
    }
    
    public void setAutor(String au){
        autor = au;
    }
    
    public Libro()
    {
        this.libros= new ArrayList<>();
    }
}