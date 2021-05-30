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
public class Esfera extends FiguraTridimensional {
    
    private int radio;
    
    public Esfera(){
        this.radio = 0;
    }
    
    public Esfera(int radio){
        this.radio = radio;
    } 
    
    @Override
    public void descripcion(){
        super.descripcion();
        System.out.println("Esta es una esfera");
    }    
    
    
    @Override
    public String obtenerArea(){
        return "Mi area es: " +  (4*3.1416)*radio*radio;
    }

    @Override
    public String obtenerVolumen(){
        return "Mi volumen es: " +   ((4*3.1416)/3)*radio*radio*radio;
    }
    
}
