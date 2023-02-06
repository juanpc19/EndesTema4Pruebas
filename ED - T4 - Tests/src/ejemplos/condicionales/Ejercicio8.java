package ejemplos.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

	// PRUEBAS CONDICIONALES (quitando la primera y la ultima todas las demas son
	// tanto condicionales como de cubrimiento
	/*
	 * nota valor=-1 resultado esperado: ERROR: La nota introducida no está
	 * comprendida entre 0 y 10 resultado obtenido: ERROR: La nota introducida no
	 * está comprendida entre 0 y 10
	 * 
	 * nota valor=11 resultado esperado: ERROR: La nota introducida no está
	 * comprendida entre 0 y 10 resultado obtenido: ERROR: La nota introducida no
	 * está comprendida entre 0 y 10
	 * 
	 * nota valor=4 resultado esperado: INSUFICIENTE resultado obtenido:
	 * INSUFICIENTE
	 * 
	 * nota valor=5 resultado esperado: SUFICIENTE resultado obtenido: SUFICIENTE
	 * 
	 * nota valor=6 resultado esperado: BIEN resultado obtenido: BIEN
	 * 
	 * 
	 * nota valor=7 resultado esperado: NOTABLE resultado obtenido: NOTABLE
	 * 
	 * nota valor=9 resultado esperado: SOBRESALIENTE resultado obtenido:
	 * SOBRESALIENTE
	 *
	 * 
	 * nota valor=10 resultado esperado: SOBRESALIENTE resultado obtenido:
	 * SOBRESALIENTE
	 */

	public static void main(String[] args) {
		// nota es la variable donde se guardará la nota introducida por el usuario por
		// teclado
		double nota;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la nota
		System.out.println("Introduzca una nota. Debe ser un valor comprendido entre 0 y 10");
		nota = sc.nextDouble();

		if (nota < 0 || nota > 10) {
			// Si la nota introducida no está en el rango solicitado mostramos un error
			System.out.println("ERROR: La nota introducida no está comprendida entre 0 y 10");
		} else {
			// Si la nota introducida se encuentra en el rango, hacemos las distintas
			// comprobaciones
			if (nota >= 0 && nota < 5) {
				// Si la nota está dentro del rango [0, 5) debe mostrarse INSUFICIENTE
				System.out.println("INSUFICIENTE");
			} else if (nota >= 5 && nota < 6) {
				// Si la nota está dentro del rango [5, 6) debe mostrarse SUFICIENTE
				System.out.println("SUFICIENTE");
			} else if (nota >= 6 && nota < 7) {
				// Si la nota está dentro del rango [6, 7) debe mostrarse BIEN
				System.out.println("BIEN");
			} else if (nota >= 7 && nota < 9) {
				// Si la nota está dentro del rango [7, 9) debe mostrarse NOTABLE
				System.out.println("NOTABLE");
			} else if (nota >= 9 && nota <= 10) {
				// Si la nota está dentro del rango [9, 10] debe mostrarse SOBRESALIENTE
				System.out.println("SOBRESALIENTE");
			}
		}
	}
}
