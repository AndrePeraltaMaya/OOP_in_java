/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author magno
 */
public class Complejo {
    
    private double parteReal;
    private double parteImaginaria;
    
    public Complejo(){
        parteReal = 0;
        parteImaginaria = 0;
    }
    public Complejo(double parteReal,double parteImaginaria){
        this.parteImaginaria = parteImaginaria;
        this.parteReal = parteReal;
        
    }
    
    private double getReal(){
        return parteReal;
    }
    
    private void setReal(double nuevoValor){
        this.parteReal = nuevoValor ;
    }   
    
    private double getImaginario(){
        return parteImaginaria;
    }
    
    private void setImaginario(double nuevoValor){
        this.parteImaginaria = nuevoValor ;
    }  
    
    public Complejo suma(Complejo a, Complejo b){
        
        Complejo c = new Complejo();
        
        double sumaReal = a.getReal() + b.getReal();
        double sumaImaginaria = a.getImaginario() + b.getImaginario();
                
        c.setReal(sumaReal);
        c.setImaginario(sumaImaginaria);
        
        return c;
    }
    public Complejo resta(Complejo a, Complejo b){
        
        Complejo c = new Complejo();
        
        double restaReal = a.getReal() - b.getReal();
        double restaImaginaria = a.getImaginario() - b.getImaginario();
                
        c.setReal(restaReal);
        c.setImaginario(restaImaginaria);
        
        return c;
    }
    
    public String mostrarNumero(){
        return "" + parteReal + " + " + parteImaginaria + "i ";
    }
}
