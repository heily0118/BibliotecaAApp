/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.BibliotecaApp.models;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Villaneda Gutierrez <sebastian.villanedag@autonoma.edu.co>
 * 
 * @version 1.0.0
 * 
 * @since 20250312
 */
public class Biblioteca {
    /**
     * 
     * arreglo de libros
     * arreglo de autores
     */
    private ArrayList <Libro> libros = new ArrayList<>();
    private ArrayList<Autor> listaAutores = new ArrayList<>();
    
    public Biblioteca(){
        
    }
    
    /**
     * Agrega un nuevo libro a la colección.
     * 
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @return ID del libro agregado.
     */
    public long agregarLibro(String titulo, Autor autor) {
        Libro libro = new Libro(titulo, autor);
        libros.add(libro);
        return libro.getId();
    }

    /**
     * Obtiene la lista de libros almacenados.
     * 
     * @return Lista de libros.
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Establece una nueva lista de libros.
     * 
     * @param libros Lista de libros a establecer.
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Obtiene la lista de autores.
     * 
     * @return Lista de autores.
     */
    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    /**
     * Establece una nueva lista de autores.
     * 
     * @param listaAutores Lista de autores a establecer.
     */
    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    /**
     * Busca un libro por su ID.
     * 
     * @param id ID del libro a buscar.
     * @return Título del libro si se encuentra, de lo contrario, "Libro no encontrado".
     */
    public String buscarLibro(long id) {
        for (Libro libro : libros) {
            if (id == libro.getId()) {
                return libro.getTitulo();
            }
        }
        return "Libro no encontrado";
    }

    /**
     * Elimina un libro de la colección.
     * 
     * @param id ID del libro a eliminar.
     * @return true si el libro fue eliminado, false si no se encontró.
     */
    public boolean eliminarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Actualiza los datos de un libro existente.
     * 
     * @param id ID del libro a actualizar.
     * @param libro Objeto con los nuevos datos del libro.
     * @return true si el libro fue actualizado, false si no se encontró.
     */
    public boolean actualizarLibro(long id, Libro libro) {
        for (Libro libroExistente : libros) {
            if (id == libroExistente.getId()) {
                libroExistente.setTitulo(libro.getTitulo());
                libroExistente.setAutor(libro.getAutor());
                libroExistente.getAutor().setEditorial(libro.getAutor().getEditorial());
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra la lista de libros con sus títulos e ID.
     * 
     * @return Cadena con la lista de libros.
     */
    public String mostrarLibros() {
        String lista = "";
        for (Libro libro : libros) {
            lista += "Titulo: " + libro.getTitulo() + " ID: " + libro.getId() + "\n";
        }
        return lista;
    }

    /**
     * Ordena y devuelve la lista de libros en orden alfabético por título.
     * 
     * @return Lista de libros ordenada alfabéticamente.
     */
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> listaOrdenada = new ArrayList<>(libros);
        int n = listaOrdenada.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listaOrdenada.get(j).getTitulo().compareTo(listaOrdenada.get(j + 1).getTitulo()) > 0) {
                    Libro temp = listaOrdenada.get(j);
                    listaOrdenada.set(j, listaOrdenada.get(j + 1));
                    listaOrdenada.set(j + 1, temp);
                }
            }
        }
        return listaOrdenada;
    }

    /**
     * Obtiene una copia de la lista de todos los libros.
     * 
     * @return Lista de libros.
     */
    public ArrayList<Libro> obtenerTodosLosLibros() {
        return new ArrayList<>(libros);
    }

    /**
     * Obtiene un libro por su ID.
     * 
     * @param id ID del libro a buscar.
     * @return Objeto Libro si se encuentra, null si no.
     */
    public Libro obtenerLibroPorId(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Obtiene un autor por su documento de identidad.
     * 
     * @param documento Documento de identidad del autor.
     * @return Objeto Autor si se encuentra, null si no.
     */
    public Autor obtenerAutorPorDocumento(long documento) {
        for (Autor autor : listaAutores) {
            if (autor.getDocumentoIdentidad() == documento) {
                return autor;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo autor a la lista de autores.
     * 
     * @param autor Autor a agregar.
     */
    public void agregarAutor(Autor autor) {
        listaAutores.add(autor);
    }

    /**
     * Obtiene el autor de un libro dado su ID.
     * 
     * @param idLibro ID del libro.
     * @return Objeto Autor si el libro se encuentra, null si no.
     */
    public Autor obtenerAutorPorIdLibro(long idLibro) {
        for (Libro libro : libros) {
            if (libro.getId() == idLibro) {
                return libro.getAutor();
            }
        }
        return null;
    }



    /*
    PRUEBAS DE FUNCIONAMIENTO
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(123, "SANGRE DE CORAZON");
        biblioteca.buscarLibro(123);
    }
 */
    
    


    /*prueba de funcionamiento metodo organizar alfabeticamente
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(1, "Java Avanzado");
        biblioteca.agregarLibro(2, "Algoritmos y estructuras de datos");
        biblioteca.agregarLibro(3, "Introducción a la Programación");
        biblioteca.agregarLibro(4, "Cálculo Diferencial");
    
        ArrayList<Libro> librosOrdenados = biblioteca.obtenerLibrosAlfabeticamente();
    
        System.out.println("Libros ordenados alfabéticamente:");
        for (int i =0; i < librosOrdenados.size(); i++) {
            System.out.println(librosOrdenados.get(i).getTitulo());
        }
*/

  
    
}
