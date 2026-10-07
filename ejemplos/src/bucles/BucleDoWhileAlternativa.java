/*
 * Objetivo: pedir números para que sume los pares y pare cuando ponga uno negativo 
 * (LOS PARES NEGATIVOS NO DEBEN ENTRAR EN LA SUMA)
 * 
 * Autor: Nubia Montesinos
 * Fecha: 7/10/26
 */
package bucles;

import java.util.Scanner;

public class BucleDoWhileAlternativa {
	
	public static void main (String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		
		int numero=1, suma=0;
		
		do {
			System.out.println("Dame un número (uno negativo para terminar): ");
			numero = teclado.nextInt();
			if (numero%2 == 0 && numero>0) {
				suma = suma+numero;
			}
		}
		while (numero >0);
		System.out.println("La suma de números pares es: "+suma);

		}
	
	}
