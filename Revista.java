/*
    Programa realizado por: Garcia Briseno Jose Carlos
 */
package publicacion;

public class Revista extends Publicacion implements Periodicidad
{
    private String ISSN;
    private int numero;
    private int years;
    
    public String getISSN(){
     return ISSN;
    }
    
    public void setISSN(String issn){
        ISSN = issn;
    }
    
    public int getNumero(){
     return numero;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
     public int getYear(){
     return years;
    }
    
    public void setYear(int year){
        years = year;
    }
    
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }
