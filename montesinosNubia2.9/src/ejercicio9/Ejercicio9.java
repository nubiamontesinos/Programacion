/*
 * Objetivo: que calcula y escribe la suma y el producto de los 10 primeros números naturales.
 * 
 * Autor: Nubia Montesinos
 * Fecha:19/10/26
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {

		int suma = 0;
		int producto=1;
		
		for (int i=1;i<=10;i++) {
			suma= suma+i;
			producto= producto*i;		
		}
		System.out.println("Suma de los 10 primeros números naturales: "+suma+"\nProducto de los 10 primeros números naturales: "+(producto));

	}
}
