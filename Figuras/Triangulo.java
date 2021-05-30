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
public class Triangulo extends FiguraBidimensional{
    
    
    public Triangulo(){
        this.base = 0;    
        this.altura = 0;          
    }
    
    public Triangulo(int base,int altura){
        
        this.base = base;    
        this.altura = altura;        
    }
    
    public void descripcion(){
        super.descripcion();
        System.out.println("Soy un triangulo");
    }    
    
    @Override
    public String obtenerArea(){
        
        return "Mi area es: " + (altura*base)/2 ;
    }  
}
