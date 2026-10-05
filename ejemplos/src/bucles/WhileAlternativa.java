package bucles;

import java.util.Scanner;

public class WhileAlternativa {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		int  numero;
		int suma=0;
		
		System.out.println("Dame un número entero (0 para terminar):");
		numero = teclado.nextInt();
		
		while (numero !=0) {
			suma  = suma+numero;
			System.out.println("dame un número (0 para terminar): ");
			numero  = teclado.nextInt();
			System.out.println("La suma es "+suma);

		}
		teclado.close();

	}

}
