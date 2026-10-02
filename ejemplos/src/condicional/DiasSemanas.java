/*
 Objetivo: pedir número 1-7 e indicar día de la semana
 */
package condicional;

import java.util.Scanner;

public class DiasSemanas {
	
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Di un número del 1 al 7: ");
		int dia = teclado.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("es lunes");
			break;
		case 2:
			System.out.println("es martes");
			break;
		case 3:
			System.out.println("es miércoles");
			break;
		case 4:
			System.out.println("es jueves");
			break;
		case 5:
			System.out.println("es viernes");
			break;

		case 6:
			System.out.println("es sábado");
			break;
			
		case 7:
			System.out.println("es domingo");
			break;
			
		default:
			System.out.println("inválido");

		}
		teclado.close();
	}
}


