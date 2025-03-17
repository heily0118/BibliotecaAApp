
package autonoma.BibliotecaApp.main;

import autonoma.BibliotecaApp.views.VentanaPrincipal;
import autonoma.BibliotecaApp.models.Biblioteca;
/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @version 1.0.0
 * 
 * @since 20250312
 */

public class BibliotecaApp {
    public static void main(String[] args) {
        
       
        Biblioteca biblioteca = new Biblioteca();

        
        VentanaPrincipal ventana = new VentanaPrincipal(biblioteca);
        ventana.setVisible(true);
        
    }
}
