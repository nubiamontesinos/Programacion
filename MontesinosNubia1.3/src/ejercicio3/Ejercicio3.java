/*
 Objetivo: Realizar un programa en Java que, dadas dos variables num1 y num2 cuyos valores se pedirán
al usuario, intercambie los valores de num1 y num2, y los muestre por pantalla.
Nota: las variables tienen que cambiar de valor.

Autor: Nubia Montesinos
Fecha: 1/10/26
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número entero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Dame otro número entero: ");
		int num2 = teclado.nextInt();
		
		// Al sumar num1+num2 resto la cantidad del número contrario, y así intercambio los valores en las nuevas asignaciones
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("Primer número: "+num1+ "\nSegundo número: "+num2);
		
		
	}
}
