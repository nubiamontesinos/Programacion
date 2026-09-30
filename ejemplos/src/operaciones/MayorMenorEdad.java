package operaciones;

import java.util.Scanner;

public class MayorMenorEdad {
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa tu edad: ");
		byte edad = teclado.nextByte();
		
		String mensajeResultado = (edad >= 18) ? "mayor de edad": "menor de edad";
		
		System.out.println("Eres "+mensajeResultado);
		
	}
}
