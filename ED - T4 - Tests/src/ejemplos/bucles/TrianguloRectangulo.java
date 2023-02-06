package ejemplos.bucles;

import java.util.Scanner;

public class TrianguloRectangulo {

	public static void main(String[] args) {
		// Número que le solicitaré al usuario por teclado
		int numero;
		
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pido al usuario un número
		System.out.println("Introduzca el número de elementos de lado que debe tener el triángulo");
		numero = sc.nextInt();
		
		// La i representa la cantidad de filas
		for(int i=1; i<=numero; i++) {
			// La j representa a la cantidad de columnas
			for(int j=i; j<=numero; j++) { // La j cuenta desde i hasta el número
				System.out.print("*");
			}
			// Al final de la línea tengo que hacer un salto de línea
			System.out.println();
		}
		sc.close();
	}

}
