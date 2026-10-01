/*
Objetivo: Se deberá realizar un programa que solicite al usuario datos relativos a un equipo de fútbol. 
Haciendo uso para ello de las variables que sean necesarias:
 En primer lugar solicitará el nombre del equipo
 Solicitará el año de fundación
 Solicitará el nombre del estadio
 Solicitará el nombre del capitán
 Mostrará por pantalla los datos de la siguiente manera:
 ***Nombre del Equipo: Torremolinos ***
 *** Fundado en: 2016 ***
 *** Estadio: Campus***
 *** Capitán: Javi M***

Autor: Nubia Montesinos
Fecha: 23/9/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa el nombre del equipo: ");
		String nombreEquipo = teclado.nextLine();
		
		System.out.println("Ingresa el año de fundación: ");
		int anyoFundacion = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Ingresa el nombre del estadio: ");
		String nombreEstadio = teclado.nextLine();
		
		System.out.println("Ingresa el nombre del capitán: ");
		String nombreCapitan = teclado.nextLine();

		System.out.println("\n***Nombre del Equipo: "+nombreEquipo+"***\n***Fundado en: "+anyoFundacion+"***\n***Estadio: "+nombreEstadio+"***\n***Capitán: "+nombreCapitan+"***");


		
	}
}
