/*
Escribir un programa en Java que transforme en euros la cantidad que se introduce como dato
en pesetas (1 euro son 166,386 pesetas) y viceversa. Primero solicitar la cantidad en euros y
transformarlo en pesetas mostrando el resultado por pantalla. A continuación hacer lo propio
pero al revés, pidiendo pesetas y pasándolo a euros.

Autor: Nubia Montesinos
Fecha: 1/10/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Cantidad de euro a transformar en pesetas: ");
		double cantidadEuros= teclado.nextFloat();
		
		double cantidadPesetas = cantidadEuros*(166.386);
		
		System.out.println(cantidadEuros+" € es igual a "+cantidadPesetas+" pesetas");
	}

}
