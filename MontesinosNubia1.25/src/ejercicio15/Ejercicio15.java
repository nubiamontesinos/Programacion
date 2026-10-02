/*
 Objetivo: Escribir un programa en Java que transforme una temperatura en grados Fahrenheit a
grados Celsius (Info: 0ºC==32F y c=(F-32)/1.8)

Nombre: Nubia Montesinos
Fecha:2/10/26
 */
package ejercicio15;

public class Ejercicio15 {
	
	public static void main (String[] args) {
		
		float gradosFahrenheit = 50.5f;
		float gradosCelsius = (gradosFahrenheit-32)/1.8f;
		
		System.out.println(gradosFahrenheit+" ºF = "+gradosCelsius+" ºCs");
	}
}
