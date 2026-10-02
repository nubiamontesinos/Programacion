/*
 Objetivo: Realiza un programa en Java que dada una variable t la cual contiene un tiempo en
segundos, nos muestre dicho tiempo expresado en horas, minutos y segundos.

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio19;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		
		int tiempoSegundos = 60;
		int horas= tiempoSegundos/3600;
		int minutos= tiempoSegundos/60;
		
		System.out.println(tiempoSegundos+" segundos =\n- "+horas+" horas\n- "+minutos+" minutos\n- "+tiempoSegundos+" segundos");
	}
		
}
