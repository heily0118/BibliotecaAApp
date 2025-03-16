
package autonoma.BibliotecaApp.models;
/* @author  Heily Yohana Rios Ayala<heilyy.riosa@autonoma.edu.co>
 * * 
 * @version 1.0.0
 * 
 * @since 20250312
 
 */

public class Autor extends Persona {
    private String editorial;
    private String profesion;

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    /**
     * @param editorial
     * @param profesion
     * @return nombre de la editorial y su profesion 
     */
    
    public String toString(){
        return super.toString() + ", Autor{editorial='" + editorial + "', profesion='" + profesion + "'}";
    }
}
