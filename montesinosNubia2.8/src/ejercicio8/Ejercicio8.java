/*
 * Objetivo: app senderismo que pida nombre, apellidos, edad (>17 y <45) 
 * (si no, indicar edad incorrecta y preguntar de nuevo).
 * número de rutas realizadas
 * distancia última ruta
 * 
 * pedir datos de 5 caminatas (distancia, participantes, ciudad)
 * Mostrar ficha:
 * ---------------------------------------------------------
 * Nombre:
 * Edad:
 * Número de rutas realizadas:
 * Distancia media (5 últimas rutas):
 * Distancia más larga de las últimas 5 rutas:
 * Ciudad de la ruta más larga:
---------------------------------------------------------

Autor: Nubia Montesinos
Fecha: 14/10/26
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
	
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Dime tus apellidos: ");
		String apellidos = teclado.nextLine();

		System.out.print("Dime tu edad: ");
		byte edad = teclado.nextByte();
		
		while (edad<17 | edad>45) {
			System.out.println("Esa edad no es correcta.");
			System.out.print("Dime tu edad de nuevo: ");
			edad = teclado.nextByte();
		}
		
		System.out.print("Di cuántas rutas has realizado: ");
		int rutasRealizadas = teclado.nextInt();
		
		System.out.print("Di la distancia de la última ruta realizada: ");
		float distanciaUltimaRuta = teclado.nextFloat();
		
				// variables bucle
				float distanciaRuta;
				int participantes;
				String ciudadRuta;
				
				// variables acumuladoras
				float sumaDistancias = 0;
				float distanciaMax = 0;
				String ciudadDistanciaMax = null;

				
				for (int i = 1; i <= 5; i++) {
					System.out.println("\nDatos de la caminata " +i+ ": ");
					
					System.out.print("Distancia: ");
					distanciaRuta = teclado.nextFloat();
					
					System.out.print("Número de participantes: ");
					participantes = teclado.nextInt();
					
					teclado.nextLine(); // limpio buffer
					System.out.print("Ciudad: ");
					ciudadRuta = teclado.nextLine();
					
					sumaDistancias = sumaDistancias+distanciaRuta;
					
					if (distanciaRuta > distanciaMax) { 
						distanciaMax = distanciaRuta;
						ciudadDistanciaMax = ciudadRuta; 
					}
				}
				
				float distanciaMedia = sumaDistancias/5;
				
				System.out.println("\n---------------------------------------------------------");
				System.out.println("Nombre: " + nombre + " " + apellidos);
				System.out.println("Edad: " + edad);
				System.out.println("Número de rutas realizadas: " + rutasRealizadas);
				System.out.println("Distancia media (5 últimas rutas): " + distanciaMedia);
				System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMax);
				System.out.println("Ciudad de la ruta más larga: " + ciudadDistanciaMax);
				System.out.println("---------------------------------------------------------");
				
				teclado.close();
	}
}
