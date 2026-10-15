/*
 * Objetivo: pedir edades y mostrar las que estén por encima de la media
 * 
 * Autor: Nubia Montesinos 
 * Fecha: 15/10/26
 */
package vectores;

public class EdadesReto {
	public static void main (String[] args) {

		int[] edades; // declaración
		final int TAMANYO=4; // para solo tener que cambiar el tamaño aquí (no en cada línea que aparezca el tamaño)
		int suma = 0;
		double media;
		int edadesMayorMedia=0;

		
		edades = new int[TAMANYO]; // inicialización
		
		for (int i=0;i<edades.length;i++)  {
			edades[i] = (int) (Math.random()*50); // cast para valores enteros  (0-49)
		}
		for (int i=0;i<edades.length;i++) {
			System.out.println("En la posición "+i+" la edad es: "+edades[i]);
			suma = suma+edades[i];
		}
		
		media = (double)suma/edades.length;
		System.out.println("Media de edad: "+media);

		for (int i=0;i<edades.length;i++) {
			if (edades[i]>media) {
				edadesMayorMedia = edadesMayorMedia+1;
			}
		}
		System.out.println("Edades por encima de la media: "+edadesMayorMedia);

	}
}
