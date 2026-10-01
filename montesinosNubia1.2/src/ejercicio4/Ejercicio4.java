/*
Objetivo: Se deberá realizar un programa que realice los siguientes pasos:
 Crea un tipo enumerado con los valores siguientes: pequeña, mediana, grande, extra-
grande.
 Crea cuatro variables del tipo enumerado anterior y asígnales a cada uno en valor den-
tro de los posibles.
 Muestra por consola el valor de cada una de las variables y un texto que explique el va-
lor.

Autor: Nubia Montesinos
Fecha: 1/10/26
 */
package ejercicio4;

public class Ejercicio4 {
			
	public enum Talla { PEQUENYA, MEDIANA, GRANDE, EXTRAGRANDE }; 

	public static void main(String[] args) {
		
		Talla tallaXS = Talla.PEQUENYA;
		Talla tallaM = Talla.MEDIANA;
		Talla tallaL = Talla.GRANDE;
		Talla tallaXL = Talla.EXTRAGRANDE;
		
		System.out.println(tallaXS+" Talla pequeña\n"+tallaM+" Talla mediana\n"+tallaL+" Talla grande\n"+tallaXL+" Talla extragrande");
		
	     
	    }
	}

