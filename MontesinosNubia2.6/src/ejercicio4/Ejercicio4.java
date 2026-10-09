/*
 * Objetivo: premiar clientes con mayor desembolso en compras. Si compras>300€ se da vale 50€ descuento
 * - solicitar nombre apellidos e importes de 4 compras distintas
 * - sumar los importes gastados por el usuario ,sacar media importeGastado.
 * - calcular la media del importe gastado (ImporteGastado1+ImpGast.2.../4)
 * - mostrar toda la información en una ficha.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 8/10/26
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main (String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.print("Dime el importe gastado 1: ");
		float importe1 = teclado.nextFloat();
		
		System.out.print("Dime el importe gastado 2: ");
		float importe2 = teclado.nextFloat();
		
		System.out.print("Dime el importe gastado 3: ");
		float importe3 = teclado.nextFloat();
		
		System.out.print("Dime el importe gastado 4: ");
		float importe4 = teclado.nextFloat();
		
		float importeMedio = (importe1+importe2+importe3+importe4)/4;
		
		float importeTotal = importe1+importe2+importe3+importe4;
		
		System.out.println("\nNombre: "+nombre+"\nApellidos: "+apellidos+"\nImporte Gastado 1: "+importe1+
					"€\nImporte Gastado 2: "+importe2+"€\nImporte Gastado 3: "+importe3+"€\nImporte Gastado 4: "+importe4
					+"€\nImporte medio: "+importeMedio+"€");
		
		if (importeTotal >300){
			System.out.println("Enhorabuena. Acaba de obtener un vale de 50€ de descuento. (Importe total: "+importeTotal+"€)");
		}
		else {
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300€ este mes, no dispone de descuento.");

		}
	}
}
