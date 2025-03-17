
package autonoma.BibliotecaApp.models;

/**
 *
 * @author Sebastian Arias
 * @since 20250312
 * @version 1.0.0
 */
public abstract class Persona {
    /**
     * 
     * nombre
     * documento de identidad
     * correo electronico
     */
    
    private String nombre;
    private String documentoIdentidad;
    private String correoElectronico;
    
    public Persona(String nombre, String documentoIdentidad, String correoElectronico){
        this. nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    /*
    *@return
    *@params nombre, docummentoIdentidad y correoElectronico
    */

    public String toString() {
        return "Nombre: " + nombre + ", Documento: " + documentoIdentidad + ", Correo: " + correoElectronico;
    }
}

