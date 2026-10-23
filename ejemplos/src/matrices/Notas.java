/*
 * Objetivo: pedir notas y alumnos y almaacenarlos en una matriz. Luego mostrar por pantalla
 * Autor: Nubia Montesinos
 * Fecha "23/10/26
 */
package matrices;

//import java.util.Scanner;

public class Notas {

	public static void main (String[] args) {
		
		//Scanner teclado=new Scanner(System.in);
		final int NUM_ALUMNOS = 10;
		final int NUM_MATERIAS = 6;

		int[][]	notas =new int[NUM_ALUMNOS][NUM_MATERIAS];
		
		// asigna notas aleatorias
		for (int alumno=0;alumno<NUM_ALUMNOS;alumno++) {
			for (int materia=0;materia<NUM_MATERIAS;materia++)  {
				notas[alumno][materia] = (int)(Math.random()*10);
			}
		}
		
		// muestra notas de cada alumno
		for (int alumno=0;alumno<NUM_ALUMNOS;alumno++) {
			System.out.print("Alumno "+alumno+":	");
			for (int materia=0;materia<NUM_MATERIAS;materia++)  {
				System.out.print(notas[alumno][materia]+"	");
			}
			System.out.println();
		}
		
		// calcular media
		int suma=0;
		double media=0;
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			suma=0;
			for (int materia=0; materia<NUM_MATERIAS;materia++) {
				suma=suma+notas[alumno][materia];
			}
			media= (double) suma/NUM_MATERIAS;
			System.out.println("Alumno "+alumno+" | Nota media: "+media);
		}
		
		// calcular media de cada materia
		int suma1=0;
		double media1=0;
		for (int materia=0; materia<NUM_MATERIAS; materia++) {
			suma1=0;
			for (int alumno=0; alumno<NUM_ALUMNOS;alumno++) {
				suma1=suma1+notas[alumno][materia];
			}
			media1= (double) suma1/NUM_ALUMNOS;
            System.out.printf("Materia %d | Nota media: %.2f%n", materia, media1);
		}
	}
}
