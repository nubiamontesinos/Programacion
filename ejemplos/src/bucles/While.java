/*
 Objetivo: pedir nºs y sumarlos mientras sean 1=0
 
 Autor: Nubia Montesinos
 Fecha: 5/10/26
 */
package bucles;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner  teclado=new Scanner(System.in);
		
		int numero =1; // inicializa en 1 para que se haga el bucle al menos 1 vez
		int suma =0 ;
		
		while (numero !=0) {
			System.out.print("Dame un número entero (para terminar debe ser 0): ");
			numero = teclado.nextInt();
			suma = suma+numero;
			System.out.println(suma);
		}

	}

}
