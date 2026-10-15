/*
 * Objetivo: guardar edades en un vector y calcular la media
 * 
 * Autor: Nubia Montesinos
 * Fecha 15/10/26
 */
package vectores;

public class Edades {
	public static void main (String[] args) {

		final int TAMANYO=4; // para solo tener que cambiar el tamaño aquí (no en cada línea que aparezca el tamaño)
		int[] edades; // declaración
		int suma = 0;
		double media;
		
		edades = new int[TAMANYO]; // inicialización
		
		for (int i=0;i<edades.length;i++)  {
			edades[i] = (int) (Math.random()*50); // cast para valores enteros  (0-49)
		}
		for (int i=0;i<edades.length;i++) {
			System.out.println("En la posición"+i+" la edad es: "+edades[i]);
			suma = suma+edades[i];
		}
		
		media = (double)suma/edades.length;
		System.out.println("La media de edad es: "+media);
	}

}
