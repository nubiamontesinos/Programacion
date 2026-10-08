/*
 * Objetivo: calculadora que pide 2 números y según selección mostrará:
 * suma, resta, multiplicación o división 
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		float num1 = teclado.nextFloat();
		
		System.out.print("Dame otro número: ");
		float num2 = teclado.nextFloat();
		
		System.out.println("Elige una opción: \n1) Suma \n2) Resta \n3) Multiplicación \n4) División");
		int opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1: {
				System.out.print("-------------------------------------------\nResultado: ");
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
			}
			
			case 2: {
				System.out.print("-------------------------------------------\nResultado: ");
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
			}
			
			case 3: {
				System.out.print("-------------------------------------------\nResultado: ");
				System.out.println(num1+" x "+num2+" = "+(num1*num2));
				break;
			}
			
			case 4: {
				System.out.print("-------------------------------------------\nResultado: ");
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;
			}
			default: {
				System.err.print("Indica una opción válida");
			}
		
		}
	}

}
