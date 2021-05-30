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
public class Cuadrado extends FiguraBidimensional {
    
    public Cuadrado(){
        this.base = 0;             
    }
    
    public Cuadrado(int base){
        
        this.base = base;          
    }
    public void descripcion(){
        super.descripcion();
        System.out.println("Soy un cuadrado");
    }
    
    public String obtenerArea(){
        return "Mi area es: " + base*base ;
    }

}
