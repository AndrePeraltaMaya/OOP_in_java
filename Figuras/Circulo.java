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
public class Circulo extends FiguraBidimensional {
    
    private int radio;
    
    public Circulo(){
        this.radio = 0;          
    }
    
    public Circulo(int radio){
            
        this.radio = radio;        
    }
    
    public void descripcion(){
        super.descripcion();
        System.out.println("Soy un circulo");
    } 
            
    
    @Override
    public String obtenerArea(){
        
        return "Mi area es: " + radio*radio*3.1416 ;
    }
    
}
