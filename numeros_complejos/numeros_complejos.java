package ejercicio1;
/**
 *
 * @author André Peralta Maya
 */
public class numeros_complejos {
    public static void main(String[] args) {
            
        Complejo a = new Complejo(2,3);
        Complejo b = new Complejo(4,8);   
        Complejo c = new Complejo();
        
        c = c.suma(a, b);
        
        System.out.println(c.mostrarNumero()); 
    }
    
}
