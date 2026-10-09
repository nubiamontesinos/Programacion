/*
 Objetivo: Escribe un programa que calcule el total de una factura a partir de la base imponible.
 Autor: Nubia Montesinos
 Fecha: 2/10/26
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float baseImponible = 100f;
		final float IVA = 0.21f; // lo pongo como K porque  me refiero al IVA 21%
		float totalFactura = (baseImponible*IVA)+baseImponible;
		
		System.out.println("Total de la factura: "+totalFactura);
		
	}

}
