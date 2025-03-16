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
     */
    private ArrayList <Libro> libros = new ArrayList<>();
    
    public Biblioteca(){
    
    }
    
    /**
     * 
     * @param id
     * @param titulo
     * @return : Se retorna un booleano
     */
    public boolean agregarLibro(long id, String titulo){
    
    Libro libro1 = new Libro(id,titulo);
    libros.add(libro1);
    return true;
    
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    /**
     * 
     * @param id
     * @return 
     */
    public String buscarLibro(long id){
        String resultado = "";
        //boolean resultadoo = false;
        
        for(Libro libro: libros){
        
            if (id == libro.getId()){
            
             resultado += libro.getTitulo();
             
                //resultadoo = true;
            }
        
        }
            
        return resultado;
        
    
    
    }
    /**
     * 
     * @param id
     * @return 
     */
    public boolean eliminarLibro(long id){
        boolean resultado = false;
        for(Libro libro: libros){
            if (id == libro.getId()){
                
                libros.remove(libro);
                resultado = true;
            }
                    
        }
    
    
    
     return resultado;
    }
    
    /**
     * 
     * @param id
     * @param titulo
     * @return 
     */
    public boolean actualizarLibro(long id, String titulo){
    
     boolean resultado = false;
     
     for(Libro libro: libros){
     
         if (id == libro.getId()){
         
             libro.setTitulo(titulo);
         }
     
     }
    
     
     return resultado;
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
    ArrayList<Libro> listaOrdenada = new ArrayList<>(libros);

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

    /*
    PRUEBAS DE FUNCIONAMIENTO
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(123, "SANGRE DE CORAZON");
        biblioteca.buscarLibro(123);
    }
 */
    
    /*
    PRUEBAS DE FUNCIONAMIENTO
   public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(123, "SANGRE DE CORAZON");
        biblioteca.buscarLibro(123);
    */

    /*prueba de funcionamiento metodo organizar alfabeticamente */
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
    }
    
}
