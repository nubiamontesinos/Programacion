package condicional;

import java.util.Scanner;

public class Notas {
	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa tu nota: ");
		float nota  = teclado.nextFloat();
		
		if (nota >= 1 && nota <= 10) {
			if (nota < 5) {
				System.out.println("Estás suspenso");
			}
			else {
				System.out.println("Estás aprobado");
			}
		}
		
		else  {
			System.out.println("Formato no válido");
		}
		System.out.println("Fin");
		
		teclado.close();
	}

}
