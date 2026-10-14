/*
 * Objetivo: pedir numeros enteros positivos, almacenar su suma y cantidad introducidos. 
 * Parar bucle al ingresar  0, y mostrar por pantalla cuántos números >0 introducidos y la media de los mismos.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 14/10/26
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int contador = 0;
                
        do {
            System.out.print("Dame un número entero positivo (0 para terminar): ");
            numero = teclado.nextInt();
            
            if (numero > 0) {
                suma = numero+suma;    
                contador++;        
            } else if (numero < 0) {
                System.out.println("Por favor, introduce solo números positivos.");
            }
            
        } while (numero != 0); 
        
      
        System.out.println("\nCantidad de números mayores que 0 introducidos: " + contador);
        
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se calcularon medias porque no se introdujeron números válidos.");
        }
        
        teclado.close(); 
    }
}


