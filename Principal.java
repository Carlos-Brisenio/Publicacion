/*
    Programa realizado por: Garcia Briseno Jose Carlos
 */
package publicacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Libro> libros= new ArrayList<>();
    static ArrayList<Revista> revistas = new ArrayList<>();
    static ArrayList<Periodico> periodicos = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int ctrlpub = 0;
        boolean salir =false;
        do{
            ctrlpub=menu(ctrlpub);
        }while(!salir);
    }
        public static int menu(int opc) throws IOException
        {
            Scanner sc = new Scanner(System.in);
            
            do{
                System.out.println("**** Menu Principal ****");
                System.out.println("1.- Alta");
                System.out.println("2.- Mostrar");
                System.out.println("3.- Salir");
                System.out.print("Elige una opcion: ");
                try{
                opc= sc.nextInt();
                }catch(Exception e){
                    sc.next();
                    System.out.println("Opcion o dato no Valido");
                }
                switch(opc){
                    case 1:
                        alta();
                        break;
                    case 2:
                        mostrar();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Opcion no valida");
                }
            }while(opc<1||opc>3);
            return opc;
        }
      
        public static void alta() throws IOException
        {
            Registro registrar = new Registro();
            int tip=0;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("\nTipo");
                System.out.println("1.-Revista");
                System.out.println("2.-Periodico");
                System.out.println("3.-Libro");            
                System.out.print("Elige: ");
                try{
                    tip= sc.nextInt();
                }catch(Exception e){
                    sc.next();
                    System.out.println("Opcion no valida");
                }
                
                if(tip==1){
                    System.out.println("");
                    System.out.println("***Registro Revista***");
                     registrar.RegistrarRevista(revistas);
                }               
                if(tip==2){
                    System.out.println("");
                    System.out.println("***Registro Periodicos***");
                    registrar.RegistrarPeriodico(periodicos);
                }           
                if(tip==3){
                    System.out.println("***Registro Libros***");
                    registrar.RegistarLibro(libros);
                }
            }while(tip<1 || tip>3);
        }
        
        public static void mostrar()
        {
            Impresion imprimir = new Impresion();
            int tip=0;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("\nTipo");
                System.out.println("1.-Revista");
                System.out.println("2.-Periodico");
                System.out.println("3.-Libro");            
                System.out.println("Elige: ");
                try{
                    tip= sc.nextInt();
                }catch(Exception e){
                    sc.next();
                    System.out.println("Opcion no valida");
                }
                
                if(tip==1){
                    System.out.print("");
                    System.out.println("**Imprimir Registro de Revistas**");
                    imprimir.ImprimirRevista(revistas);
                }               
                if(tip==2){
                    System.out.print("");
                    System.out.println("**Imprimir Registro de Periodicos**");
                    imprimir.ImprimirPeriodico(periodicos);
                }           
                if(tip==3){
                    System.out.print("");
                    System.out.println("**Imprimir Registro de Libros**");
                    imprimir.ImprimirLibro(libros);
                }
            }while(tip<1 || tip>3);
        }
}