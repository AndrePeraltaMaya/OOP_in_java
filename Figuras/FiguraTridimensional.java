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
public abstract class FiguraTridimensional extends Figure{ 
    protected int lado;  
    
    protected void descripcion(){
        System.out.println("Esta es una figura tridimensional");
    }

    protected abstract String obtenerVolumen();
}
