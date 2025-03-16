
package autonoma.BibliotecaApp.models;


public class Autor extends Persona {
    private String editorial;
    private String profesion;

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
    
    
    
}
