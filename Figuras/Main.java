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
public class Main {
    public static void main(String[] args) {
        
        Figure figuras[] = new Figure[6];
        
        figuras[0] = new Cuadrado(4);
        figuras[1] = new Triangulo(3,5);
        figuras[2] = new Circulo(8);
        
        figuras[3] = new Esfera(5);
        figuras[4] = new Cubo(3);
        figuras[5] = new Tetraedro(8);
        
        for (Figure i : figuras) {
            if (i instanceof FiguraBidimensional ) {
                i.descripcion();
                System.out.println(i.obtenerArea()+ "\n");
            }
            else if(i instanceof FiguraTridimensional ){
                i.descripcion();
                System.out.println(i.obtenerVolumen());
                System.out.println(i.obtenerArea()+ "\n");
            }
        }
       
    }
}
