/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import static java.lang.Math.sqrt;

/**
 *
 * @author magno
 */

public class Tetraedro extends FiguraTridimensional {
    
    
    public Tetraedro(){
        this.lado = 0;
    }
    public Tetraedro(int lado){
        this.lado = lado;
    }
    
    @Override
    public void descripcion(){
        super.descripcion();
        System.out.println("Este es un tetraedro");
    }
    
    public String obtenerArea(){
        return "Mi area es: " +  (lado*lado)*sqrt(3);
    }

    public String obtenerVolumen(){
        return "Mi volumen es: " +  (lado*lado*lado)*(sqrt(2)/12);
    }   
    
}
