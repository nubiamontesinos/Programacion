/*
 Objetivo: Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la
nota del primer examen cuenta el 40% y la del segundo examen un 60%

Autor: Nubia Montesinos
Fecha: 5/10/26
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Dime la nota del primer examen (0 - 10): ");
        double nota1 = teclado.nextDouble();
        
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Error. La nota debe estar entre 0 y 10.");
            teclado.close();
        }
        
        System.out.print("¿Qué nota final quieres sacar en la asignatura? (0 - 10): ");
        double notaFinal = teclado.nextDouble();
        
        if (notaFinal < 0 || notaFinal > 10) {
            System.out.println("Error. La nota final deseada debe estar entre 0 y 10.");
            teclado.close();
        }
        
        double nota2 = (notaFinal - (nota1 * 0.40)) / 0.60;
        
        if (nota2 > 10) {
            System.out.printf("\nNecesitas sacar un %.2f. No puedes alcanzar la media deseada. ", nota2);
        } 
        else if (nota2 < 0) {
            System.out.printf("\nYa tienes asegurada esa media.");
        } 
        else {
            System.out.printf("\nPara obtener un %.2f de media, necesitas sacar un %.2f en el segundo examen.", notaFinal, nota2);
        }
        
        teclado.close();
    }
}
