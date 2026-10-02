/*
 Objetivo: medir IMC pidiendo datos
 
 Autor: Nubia Montesinos
 Fecha: 2/10/26
 */
package condicional;

import java.util.Scanner;

public class Imc {
	
	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime tu peso (ej: 50,5): ");
		float peso = teclado.nextFloat();
		System.out.println("Dime tu altura (ej: 1,50): ");
		float altura = teclado.nextFloat();
		
		float imc=peso/(altura*altura);
		String resultado=null;
		
		if (imc <16) {
			resultado = "criterio de ingreso en hospital";
		}
		else if (imc <17) {
			resultado = "infrapeso";
		}
		else if (imc <18) {
			resultado = "bajo peso";
		}
		else if (imc <25) {
			resultado = "normopeso (peso normal)";
		}
		else if (imc <30) {
			resultado = "sobrepeso (grado I)";
		}
		else if (imc <35) {
			resultado = "sobrepeso crónico (grado II)";
		}
		else if (imc <40) {
			resultado = "obesidad premórbida (grado III)";
		}
		else if (imc >=40) {
			resultado = "obesidad mórbida (grado IV)";
		}
		
		System.out.println("Tu IMC es: "+imc+". Estás en "+resultado);
		
		teclado.close();
	}
	

}
