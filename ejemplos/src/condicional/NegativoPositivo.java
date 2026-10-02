/*
 Objetivo: pedir un número e indicar si es positivo o negativo y si es o no par
 
 Autor: Nubia Montesinos
 Fecha: 2/10/26
 */
package condicional;

import java.util.Scanner;

public class NegativoPositivo {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime un número entero (sin decimales): ");
		int num1 = teclado.nextInt();
		
		if (num1 > 0) {
			System.out.println("El número es positivo");
			if (num1%2 == 0) {
				System.out.println("El número "+num1+ " es par");
			}
			else if (num1%2 != 0) {
				System.out.println("El número "+num1+" es impar");
			}
		}
		else if (num1 < 0) {
				System.out.println("El número es negativo");
				if (num1%2 == 0) {
					System.out.println("El número "+num1+ " es par");
				}
				else if (num1%2 != 0) {
					System.out.println("El número "+num1+" es impar");
				}
		}
		else {
			System.out.println("¡El número es 0!");
		}
		
	}

}
