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
     */
    private ArrayList <Libro> libros = new ArrayList<>();
    private ArrayList<Autor> listaAutores = new ArrayList<>();
    
    public Biblioteca(){
    }
    
    /**
     * 
     * @param id
     * @param titulo
     * @return : Se retorna un booleano
     */
    public long agregarLibro(String titulo, Autor autor){
        
        Libro libro = new Libro(titulo, autor); 
        libros.add(libro);
        return libro.getId();
    }        

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }
    
    
    /**
     * 
     * @param id
     * @return 
     */
    public String buscarLibro(long id){
        for (Libro libro : libros) {
        if (id == libro.getId()) {
            return libro.getTitulo(); 
        }
    }
    return "Libro no encontrado"; 
        
    
    
    }
    /**
     * 
     * @param id
     * @return 
     */
    public boolean eliminarLibro(long id){
       for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == id) {
            libros.remove(i);
            return true;
        }
    }
    return false;
    }
    
    /**
     * 
     * @param id
     * @param titulo
     * @return 
     */
   public boolean actualizarLibro(long id, Libro libro){
    boolean resultado = false;
    for(Libro libroExistente: libros){
        if (id == libroExistente.getId()){
            libroExistente.setTitulo(libro.getTitulo());
            libroExistente.setAutor(libro.getAutor());
            libroExistente.getAutor().setEditorial(libro.getAutor().getEditorial());
            return true;
        }
    }
   return false;
   }

    /**
     * 
     * @return 
     */
    public String mostrarLibros(){
    
        String lista = "";
        
        for(Libro libro:libros){
        
            lista+= "Titulo : " + libro.getTitulo() + "ID: " +  libro.getId() + "\n";
            
        
        
        }
        return lista;
    
    }
/*
metodo para ordenar los libros en orden alfabetico usando el metodo bubble sort
*/
public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
    ArrayList<Libro> listaOrdenada = new ArrayList<>(libros); // Crear una copia para no modificar la original
    int n = listaOrdenada.size();
    
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (listaOrdenada.get(j).getTitulo().compareTo(listaOrdenada.get(j + 1).getTitulo()) > 0) {
                // Intercambiar los libros
                Libro temp = listaOrdenada.get(j);
                listaOrdenada.set(j, listaOrdenada.get(j + 1));
                listaOrdenada.set(j + 1, temp);
            }
        }
    }
    return listaOrdenada;
}

public ArrayList<Libro> obtenerTodosLosLibros() {
    return new ArrayList<>(libros); 
}

public Libro obtenerLibroPorId(long id) {
    for (Libro libro : libros) {
        if (libro.getId() == id) {
            return libro; 
        }
    }
    return null;
}
public Autor obtenerAutorPorDocumento(long documento) {
    for (Autor autor : listaAutores) {
        if (autor.getDocumentoIdentidad() == documento) {
            return autor;
        }
    }
    return null;
}
public void agregarAutor(Autor autor) {
    listaAutores.add(autor);
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
