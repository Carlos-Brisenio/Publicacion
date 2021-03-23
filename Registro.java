/*
    Programa realizado por: Garcia Briseno Jose Carlos
 */
package publicacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
     ArrayList<Libro> libros = new ArrayList<>();
   ArrayList<Revista> revistas = new ArrayList<>();
   ArrayList<Periodico> periodicos = new ArrayList<>();
    
    public void RegistarLibro(ArrayList<Libro> libros)throws IOException{
        Scanner leer = new Scanner(System.in);
        Libro RegistroLib = new Libro();
        System.out.println();
        System.out.print("Ingrese el Titulo: ");
        RegistroLib.setTitulo(leer.nextLine());
        System.out.print("Numero de Paginas: ");
        RegistroLib.setNumpag(Integer.parseInt(leer.nextLine()));
        System.out.print("Nombre del Autor: ");
        RegistroLib.setAutor(leer.next());
        leer.nextLine();
        System.out.print("Numero de Edicion: ");
        RegistroLib.setEdicion(leer.next());
        leer.nextLine();
        System.out.print("Normalizacion ISBN: ");
        RegistroLib.setISBN(leer.nextLine());
        System.out.print("Precio: ");
        RegistroLib.setPrecio(Double.parseDouble(leer.nextLine()));
        libros.add(RegistroLib);
        System.out.println();
    }
    
    
    public void RegistrarRevista(ArrayList<Revista> revistas)throws IOException{
        Scanner leer = new Scanner(System.in);
        Revista RegistroRev = new Revista();
        System.out.print("Ingrese el Titulo: ");
        RegistroRev.setTitulo(leer.nextLine());
        System.out.print("Numero de Paginas: ");
        RegistroRev.setNumpag(Integer.parseInt(leer.nextLine()));
        System.out.print("Precio: ");
        RegistroRev.setPrecio(Double.parseDouble(leer.nextLine()));
        System.out.print("Numero de revista: ");
        RegistroRev.setNumero(Integer.parseInt(leer.nextLine()));
        System.out.print("Identificador ISSN: ");
        RegistroRev.setISSN(leer.nextLine());
        System.out.print("Año de publicacion: ");
        RegistroRev.setYear(Integer.parseInt(leer.nextLine()));
        revistas.add(RegistroRev); 
        System.out.println();

    }
    
    
    public void RegistrarPeriodico(ArrayList<Periodico> periodicos)throws IOException{
        Scanner leer = new Scanner(System.in);
        Periodico RegistroPer = new Periodico();
        System.out.print("Ingrese el Titulo: ");
        RegistroPer.setTitulo(leer.nextLine());
        System.out.print("Secciones: ");
        RegistroPer.setSecciones(leer.nextLine());
        System.out.print("Numero de Paginas: ");
        RegistroPer.setNumpag(Integer.parseInt(leer.nextLine()));
        System.out.print("Precio: ");
        RegistroPer.setPrecio(Double.parseDouble(leer.nextLine()));
        System.out.print("Fecha de publicacion: ");
        RegistroPer.setFecha(leer.nextLine());
        System.out.print("Ingrese el editor: ");
        RegistroPer.setEditor(leer.nextLine());
        System.out.print("Lugar de publicacion: ");
        RegistroPer.setLocalidad(leer.nextLine());
        periodicos.add(RegistroPer);  
        System.out.println();

    }
}