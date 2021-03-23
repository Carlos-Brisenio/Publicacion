/*
    Programa realizado por: Garcia Briseno Jose Carlos
 */
package publicacion;

import java.util.ArrayList;

public class Impresion {
    public void ImprimirLibro(ArrayList<Libro> libros){
        for (Libro libro : libros) {
            System.out.println();
            System.out.println("Titulo: "+libro.getTitulo());
            System.out.println("Autor: "+ libro.getAutor());
            System.out.println("Edicion: "+libro.getEdicion());
            System.out.println("Paginas: "+libro.getNumpag());
            System.out.println("Normalizacion ISBN: "+libro.getISBN());
            System.out.println("Precio: "+libro.getPrecio());
            System.out.println();
        }
    }
    
    public void ImprimirRevista(ArrayList<Revista> revistas){
        for (Revista revista : revistas) {
            System.out.println();
            System.out.println("Titulo: "+revista.getTitulo());
            System.out.println("Numero de Paginas: "+revista.getNumpag());
            System.out.println("Precio: "+revista.getPrecio());
            System.out.println("Numero de revista: "+revista.getNumero());
            System.out.println("Identificador ISSN: "+revista.getISSN());
            System.out.println("Año de publicacion: "+revista.getYear());
            System.out.println("Periodicidad: "+revista.periodicidad);
            System.out.println();
        }
    }
    
    public void ImprimirPeriodico(ArrayList<Periodico> periodicos){
        for (Periodico periodi : periodicos) {
            System.out.println();
            System.out.println("Titulo: "+periodi.getTitulo());
            System.out.println("Secciones: "+periodi.getSecciones());
            System.out.println("Numero de Paginas: "+periodi.getNumpag());
            System.out.println("Precio: "+periodi.getPrecio());
            System.out.println("Editor: "+periodi.getEditor());
            System.out.println("Lugar de publicacion: "+periodi.getLocalidad());
            System.out.println("Fecha de publicacion: "+periodi.getFecha());
            System.out.println("Periodicidad: "+periodi.periodicidad);
            System.out.println();

        }
    }
}
