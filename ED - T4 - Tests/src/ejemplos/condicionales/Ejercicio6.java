package ejemplos.condicionales;

import java.util.Scanner;

/* En la resolución de una ecuación de 2º grado tenemos que tener cuidado con dos cosas:
 * 1. Que el valor del interior de la raíz no sea negativo.
 * 2. No podemos dividir por 0
 */
public class Ejercicio6 {

	// PRUEBAS DE CUBRIMIENTO
	/*
	 * a valor =0 
	 * b valor =2 
	 * c valor =5
	 * resultado esperado: finaliza ejecucion sin hacer nada
	 * resultado obtenido: finaliza ejecucion sin hacer nada
	 * 
	 * 
	 * a valor =1 
	 * b valor =2 
	 * c valor =5
	 * resultado esperado: La ecuación no tiene solución real.
	 * resultado obtenido: La ecuación no tiene solución real.
	 * 
	 * a valor =1 
	 * b valor =2 
	 * c valor =0
	 * resultado esperado: Las soluciones de la ecuación son: -1.0, -1.0
	 * resultado obtenido: Las soluciones de la ecuación son: -1.0, -1.0
	 * 
	 */

	public static void main(String[] args) {
		// Declaramos las variables a, b y c, que serán los coeficientes de la ecuación
		int a, b, c;

		// Declaramos las variables x1 y x2, que serán las soluciones de la ecuación de
		// segundo grado
		double x1, x2;

		// Creamos una variable donde guardar la operación que se realiza dentro de la
		// raíz
		double interiorRaiz;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca por teclado los coeficientes de la
		// ecuación de 2º grado
		System.out.println("Introduzca el valor para a:");
		a = sc.nextInt();

		System.out.println("Introduzca el valor para b:");
		b = sc.nextInt();

		System.out.println("Introduzca el valor para c:");
		c = sc.nextInt();

		/*
		 * Si la a vale cero no se trata de una ecuación de 2º grado, pero se podría
		 * resolver como una ecuación de 1º grado
		 */
		if (a == 0) {
			/* TODO: Resolver ecuación de 1º grado */

		} else {
			/*
			 * Si lo que se encuentra dentro de la raíz es un valor negativo, la ecuación no
			 * tiene solución
			 */
			interiorRaiz = b ^ 2 - 4 * a * c;

			if (interiorRaiz < 0) { // Si es negativo, no tiene solución
				System.out.println("La ecuación no tiene solución real.");
			} else { // Si el interior de la raíz es >= 0, entonces sí tiene solución

				// Calculamos la primera solución con +
				x1 = (-b + Math.sqrt(interiorRaiz)) / (2 * a);

				// Calculamos la segunda solución con -
				x2 = (-b - Math.sqrt(interiorRaiz)) / (2 * a);

				// Mostramos las soluciones al usuario
				System.out.println("Las soluciones de la ecuación son: " + x1 + ", " + x2);
			}
		}
	}
}
