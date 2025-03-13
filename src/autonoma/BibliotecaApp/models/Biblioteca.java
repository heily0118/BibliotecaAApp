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
    
    
    
}
