public class Main {
    public static void main(String[] args) {

        //int TAMANIO_MAX = 101; // Universo de 0 - 100
        //boolean[] booleanArray = new boolean[ TAMANIO_MAX ];
        
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        ConjuntoEnteros clon1 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();


        System.out.println("El cojunto 1 está vacio: " + conjunto1 );
        for ( int i = 0; i <  6; i++  ) // Habilita del 0 al 5 en el conjunto1
        {
            conjunto1.InsertarElemento(i);
            clon1.InsertarElemento(i); // clon 1 será igual a conjunto1
        }
        System.out.println( "Conjunto 1 actualizado: " + conjunto1 );



        System.out.println("El cojunto 2 está vacio: " + conjunto2 );
        for ( int i = 0; i <  11; i += 2  ) // Habilita del 0 al 10 en saltos de 2
        {
            conjunto2.InsertarElemento(i);
        }
        System.out.println( "Conjunto 2 actualizado: " + conjunto2 );
       
       
       
        System.out.printf("\nUnion:  " + ConjuntoEnteros.union( conjunto1, conjunto2 ) +"\n" );
        System.out.println("Intersección:  " + ConjuntoEnteros.Interseccion( conjunto1, conjunto2 ) );

        System.out.printf("\nConjunto1 "+  conjunto1 + " es igual a Conjunto2 " + conjunto2 +" ? :  " + conjunto1.esIgualA(conjunto2) + "\n");
        System.out.println("Conjunto1 " + conjunto1 + " es igual a Clon1 " + clon1 + " ? :  " + conjunto1.esIgualA(clon1) );
        
        System.out.printf("\nEliminado el número 4 de conjunto 1 y 2" + "\n");
        conjunto1.EliminarElemento(4);
        conjunto2.EliminarElemento(4);
        System.out.printf("Conjunto1 = " + conjunto1 + "\nConjunto2 = " + conjunto2 );

        
    }
}