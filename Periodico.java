/*
    Programa realizado por: Garcia Briseno Jose Carlos
 */
package publicacion;

public class Periodico extends Publicacion implements Periodicidad {
    
    private String editor;
    private String localidad;
    private String fecha;
    private String secciones;


    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getSecciones() {
        return secciones;
    }

    public void setSecciones(String secciones) {
        this.secciones = secciones;
    }
    

    @Override
    public String getPeriodicidad() {
        return periodicidad;
    }
       
}