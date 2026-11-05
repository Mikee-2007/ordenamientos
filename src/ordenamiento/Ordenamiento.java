package ordenamiento;

import java.util.Arrays;

public class Ordenamiento {

    public static void main(String[] args) {
       
        int[] datos = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("--- MERGE SORT (ID PAR) ---");
        System.out.println("Arreglo original: " + Arrays.toString(datos));

        // Llamada inicial pasando índice 0 hasta longitud - 1
        MergeSort.ordenar(datos, 0, datos.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(datos));
    }
    
}
