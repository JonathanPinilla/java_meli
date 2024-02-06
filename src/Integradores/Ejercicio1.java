package Integradores;

import java.util.Arrays;

public class Ejercicio1 {


    public static void main(String[] args) {
        int[] arreglo = {2, 6, 30, 8, -3, 65, 12, 54, -21, 0};

        int[] ordenado = burbuja(arreglo);
        int[] ordenado2 = burbuja2(arreglo);
        System.out.println(Arrays.toString(ordenado));
        System.out.println(Arrays.toString(ordenado2));
    }

    public static int[] burbuja(int[] arreglo) {

        boolean estaOrdenado;
        int temp, tamano = arreglo.length;

        do{
            estaOrdenado = true;
            for (int i = 0; i < tamano - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    estaOrdenado = false;
                }
            }
        } while (!estaOrdenado);

        return arreglo;
    }

    public static int[] burbuja2(int[] arreglo) {

        boolean estaOrdenado;
        int temp, tamano = arreglo.length;

        do{
            estaOrdenado = false;
            for (int i = 0; i < tamano - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    estaOrdenado = true;
                }
            }
            tamano --;
        } while (estaOrdenado);

        return arreglo;
    }
}
