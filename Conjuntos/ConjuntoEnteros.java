public class ConjuntoEnteros{

    private static final int TAMANIO_MAX = 101; // Universo de 0 - 100
    final boolean[] booleanArray = new boolean[ TAMANIO_MAX ]; //false por defecto


    public void InsertarElemento(int entero){
        booleanArray[entero] = true;
    }

    public void EliminarElemento(int entero){
        booleanArray[entero] = false;
    }


    public static ConjuntoEnteros union(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2 ){

        ConjuntoEnteros union = new ConjuntoEnteros();

        for(int i = 0 ; i < TAMANIO_MAX; i++){
            union.booleanArray[i] = conjunto1.booleanArray[i] || conjunto2.booleanArray[i];
        }

        return union;
    }

    public static ConjuntoEnteros Interseccion(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros interseccion = new ConjuntoEnteros();

        for(int i = 0; i < TAMANIO_MAX ; i++){
            interseccion.booleanArray[i] = conjunto1.booleanArray[i] && conjunto2.booleanArray[i];
        }

        return interseccion;
    }


    public boolean esIgualA(ConjuntoEnteros conjunto){

        for(int i = 0; i< TAMANIO_MAX; i++){
            if(booleanArray[i] != conjunto.booleanArray[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){
        boolean vacio = true;
        StringBuilder string = new StringBuilder(); //se que esta función no nos la ha enseñado pero fue la unica manera que encontré de hacerlo
        string.append("[ ");

        for(int i = 0; i< TAMANIO_MAX; i++){
            if(booleanArray[i]){
                vacio = false; // con que un valor sea true el arreglo no está vacio
                string.append(i); // inserta el dato solo si su valor es true
                string.append(" ");
            }
        }
        return vacio? "---": string.append("]").toString();
    }
}
