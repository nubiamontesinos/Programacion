/* 
 * Objetivo: pedir datos a usuario y mostrar un mensaje como este:
 * Los datos ingresados fueron:
 * Nombre: nombreUsuario
 * Edad: edadUsuario
 * AlturaUsuario
 * 
 * Autor: Nubia Montesinos
 * Fecha: 23/9/26
 */
package datosScanner;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DatosScanner {
	
	public  static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre = null;
		byte edad = 0;
		float altura = 0;
		
		
			try {
				System.out.println("Ingresa tu nombre: ");
				nombre = teclado.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println("Error. Prueba de nuevo.");
			}
			
			
			try {
				System.out.println("Ingresa tu edad: ");
				edad = teclado.nextByte();
			}
			
			catch (InputMismatchException e) {
				System.out.println("Formato no válido. Asegúrate de usar números enteros positivos");
			}
			
			
			try {
			System.out.println("Ingresa tu altura en metros (y con coma. Ej: 1,50: ");
			altura = teclado.nextFloat();
			
			}
			
			catch (InputMismatchException e) {
				System.out.println("Formato no válido. Asegúrate de usar el formato 0,0");
			}
			
			teclado.close();
			
			System.out.println("\nLos datos ingresados fueron: \nNombre: "+nombre+"\nEdad: "+edad+"\nAltura: "+altura);
		}

	}