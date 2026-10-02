/*
 Realiza un programa en Java que solicite dos números al usuario y calcule lo siguiente:
 Qué número es menor, y lo muestre por pantalla.
 Calcule el valor del primer número elevado al segundo y lo muestre por pantalla.
 Calcule la raíz cuadrada del primer número y la muestre por pantalla.
 Calcule un valor random del segundo número y lo muestre por pantalla.
Nota: solo se pueden usar funciones de la clase Math

Autor: Nubia Montesinos
Fecha: Nubia Montesinos
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Dime otro número: ");
		int num2 = teclado.nextInt();
		
		// número mayor o menor de los dos
		System.out.println("El menor de los dos números es: "+Math.min(num1, num2));
		
		// valor del primero elevado al segundo
		System.out.println("Valor del primer número elevado al segundo: "+Math.pow(num1, num2));

		// raíz cuadrada  del primer número
		System.out.println("Raíz cuadrada de "+num1+" "+Math.sqrt(num1));

		// calcular valor random del segundo número
		System.out.println("Valor random para "+num2+" "+Math.random()*num2);
	}
}
