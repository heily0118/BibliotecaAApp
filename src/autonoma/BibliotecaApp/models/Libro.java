
package autonoma.BibliotecaApp.models;

/**
 *
 * @author Santiago Uribe
 * @version 1.0.0
 * @since 20250312
 */
public class Libro {     
    /**
     * 
     * id del libro
     * titulo del libro
     * autor del libro
     * contador de libros
     */
    private long id;
    private String titulo;
    private Autor autor;
    private static int contadorLibros = 0;

    public Libro(long id, String titulo, Autor autor) {
    this.id = ++contadorLibros; ;
    this.titulo = titulo;
    this.autor = autor;
}

    public long getId() {
        return id;
    }

    /*public void setId(long id) {
        this.id = id;
    }
    */
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
   @Override
public String toString() {
    return "Libro{id=" + id + ", titulo='" + titulo + "', autor='" + autor.getNombre() + "'}";
}
}
