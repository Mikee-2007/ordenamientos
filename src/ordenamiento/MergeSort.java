package ordenamiento;

public class MergeSort {
    //este metodo es el principal recursivo que divide el arreglo
    public static void ordenar (int [] arreglo, int izquierda, int derecha){
        if(izquierda < derecha){
            //encuentra el medio del subarrelgo actual
            int medio = izquierda + (derecha - izquierda) / 2;
            // ordena recursivamente la primera mitad
            ordenar(arreglo, izquierda, medio);
            // ordena recursivamente la segunda mitad
            ordenar(arreglo, medio + 1, derecha);
            //mescla las dos mitades ya ordenadas
            mezclar(arreglo,izquierda,medio,derecha);
        }
    }
    
    // Método privado que realiza la fusión ordenada de dos subarreglos
    private static void mezclar(int[] arreglo, int izquierda, int medio, int derecha) {
        // Calcula los tamaños de los dos subarreglos
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        // Crea arreglos auxiliares temporales
        int[] izq = new int[n1];
        int[] der = new int[n2];

        // Copia los datos a los arreglos temporales
        for (int i = 0; i < n1; ++i) {
            izq[i] = arreglo[izquierda + i];
        }
        for (int j = 0; j < n2; ++j) {
            der[j] = arreglo[medio + 1 + j];
        }

        // indice iniciales de los subarreglos izq y der
        int i = 0, j = 0;
        int k = izquierda; // Índice inicial del arreglo combinado

        // Comparar elemento a elemento y copiar el menor al arreglo original
        while (i < n1 && j < n2) {
            if (izq[i] <= der[j]) {
                arreglo[k] = izq[i];
                i++;
            } else {
                arreglo[k] = der[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes si quedaron en izq[]
        while (i < n1) {
            arreglo[k] = izq[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes si quedaron en der[]
        while (j < n2) {
            arreglo[k] = der[j];
            j++;
            k++;
        }
    }
}
