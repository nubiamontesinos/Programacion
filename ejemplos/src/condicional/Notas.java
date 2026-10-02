/*
Objetivo: pedir nota y mostrar x  resultado dependiendo de la franja en la que esté
Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package condicional;

import java.util.Scanner;

public class Notas {
	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa tu nota: ");
		int nota  = teclado.nextInt();
		
		if (nota >= 1 && nota <= 10) {
			if (nota < 5) {
				System.out.println("INSUFICIENTE");
			}
			else if (nota <6){
				System.out.println("SUFICIENTE");
			}
			else if (nota <7) {
				System.out.println("BIEN");
			}
			else if (nota <9) {
				System.out.println("NOTABLE");
			}
			else if (nota <=10) {
				System.out.println("SOBRESALIENTE");
			}
		}
		
		else  {
			System.out.println("Formato no válido");
		}
		System.out.println("Fin");
		
		teclado.close();

	}
}
