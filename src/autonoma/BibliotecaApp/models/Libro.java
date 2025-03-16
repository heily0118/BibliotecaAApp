
package autonoma.BibliotecaApp.models;

/**
 *
 * @author Santiago Uribe
 * @version 1.0.0
 * @since 20250312
 */
public class Libro {        
    private long id;
    private String titulo;
    private Autor autor;

    public Libro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    /*
    *
    *@return 
    *@param id y titulo
    */
    public String toString() {
        return "Libro{id=" + id + ", titulo='" + titulo + "'}";
    }
}
