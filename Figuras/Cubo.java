/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author magno
 */
public class Cubo extends FiguraTridimensional { 
    
    public Cubo(){
        this.lado = 0;
    }
    public Cubo(int lado){
        this.lado = lado;
    }
    
    @Override
    public void descripcion(){
        super.descripcion();
        System.out.println("Este es un cubo");
    }
    
    public String obtenerArea(){
        return "Mi area es: " +  (lado*lado)*6;
    }

    public String obtenerVolumen(){
        return "Mi volumen es: " +   lado*lado*lado;
    }   
    
}
