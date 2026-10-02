/*
 Objetivo: Escribe un programa que calcule el total de una factura a partir de la base imponible 
(precio sin IVA). La base imponible estará almacenada en una variable.

Autor: Nubia Montesinos
Fecha: 2/10/26
 */
package ejercicio17;

public class Ejercicio17 {
	
	public static void main (String[] args) {
		
		float baseImponible = 50f;
		float totalFactura = baseImponible+(baseImponible*0.21f);
		
		System.out.println("La factura sobre la base imponible "+baseImponible+" es: "+totalFactura);
	}

}
