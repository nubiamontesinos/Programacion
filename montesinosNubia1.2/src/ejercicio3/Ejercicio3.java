/*
 Objetivo: Se deberá realizar un programa que realice los siguientes pasos:
 Crea dos variables de tipo int, num1 y num2, inicializa ambas variables a 1.
 Crea dos variables de tipo char, char1 y char2, asígnales un valor también.
 Crea dos variables de tipo String Cargo y Nombre, inicializa ambas con tus datos. (El
cargo lo puedes inventar)
 Muestra por pantalla el valor de las variables num1 y num2 con un texto que lo
acompañe.
 Muestra por pantalla el siguiente mensaje, haciendo uso de las variables nombre y
cargo:
Bienvenido, <cargo> <nombre>.
Ejemplo: Bienvenido, capitán Gómez,
donde “capitán” es el cargo y “Gómez” es el nombre.

Autor: Nubia Montesinos
Fecha: 1/10/26
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main (String[] args) {
		int num1=1, num2=1;
		char char1='n', char2='d';
		String Cargo="Programadora", Nombre="Nubia";
		
		System.out.println(num1+" "+num2+" Identificador de usuario");
		System.out.println("Bienvenido, "+Cargo+" "+Nombre);
		
	}
}
