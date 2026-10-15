/*
 * Objetivo: muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 15/10/26
 */
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
