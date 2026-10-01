/* 
 Realizar un programa en Java que solicite al usuario los siguientes datos:
 Nombre
 Apellidos
 Fecha Nacimiento
 Salario bruto
 Años trabajando en la empresa
A partir de estos datos el programa debe de hacer lo siguiente:
 Calcular el salario neto del usuario (salario bruto menos 15% de IRPF)
 Mostrar una ficha al usuario en la que se le indique:
Estimad@ (Nombre Apellidos), su salario bruto es (salario bruto), teniendo en
cuenta un IRPF del 15% su salario neto es (salario neto).
Debido a sus (número de años trabajando en la empresa) años trabajando en la
empresa su salario se incrementará en un 2% por cada año. El aumento es de
(aumento) y el salario total es (salario total).

Autor: Nubia Montesinos
Fecha: 1/10/26
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] arg) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Dime tus apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.println("Dime tu fecha de nacimiento (formato 00/00/00: ");
		String fechaNacimiento = teclado.nextLine();
		
		System.out.println("Dime tu salario bruto: ");
		double salarioBruto = teclado.nextFloat();
		
		System.out.println("Di los años trabajando en la empresa: ");
		
		int anyosTrabajando = teclado.nextInt();
		
		double salarioNeto  = salarioBruto - (salarioBruto*0.15);
		
		double aumento = salarioNeto*0.02;
		
		double salarioTotal = aumento+salarioNeto;
		
		System.out.println("Estimad@ "+nombre+" "+apellidos+" , su salario bruto es ("+salarioBruto+
				"), teniendo en cuenta un IRPF del 15% su salario neto es ("+salarioNeto+
				"). Debido a sus "+anyosTrabajando+" años trabajando en la empresa, su salario se incrementará en un 2% por cada año. "+
				"El aumento es de ("+aumento+") y el salario total es "+salarioTotal);
	}

}
