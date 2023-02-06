package ejemplos.condicionales;

import java.util.Scanner;

public class Ejercicio4switch {

	public static void main(String[] args) {
		// Las variables tirada1 y tirada2 guardarán los valores en formato cadena
		// introducidos por el usuario
		String tirada1, tirada2;

		// Las variables valor1 y valor2 guardarán los valores de las tiradas en números
		// enteros
		int valor1, valor2;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario las dos tiradas
		System.out.println("¿Cuánto ha sacado en la primera tirada? UNO, DOS, TRES, CUATRO, CINCO o SEIS?");
		tirada1 = sc.nextLine();

		System.out.println("¿Cuánto ha sacado en la segunda tirada? UNO, DOS, TRES, CUATRO, CINCO o SEIS?");
		tirada2 = sc.nextLine();

		valor1 = switch (tirada1) {
		case "UNO" -> {
			// Devolvemos 1
			yield 1;
		}
		case "DOS" -> {
			// Devolvemos 2
			yield 2;
		}
		case "TRES" -> {
			// Devolvemos 3
			yield 3;
		}
		case "CUATRO" -> {
			// Devolvemos 4
			yield 4;
		}
		case "CINCO" -> {
			// Devolvemos 5
			yield 5;
		}
		case "SEIS" -> {
			// Devolvemos 6
			yield 6;
		}
		default -> {
			// El usuario no ha introducido un valor correcto
			System.out.println("El valor de la primera tirada es erróneo");
			yield 0;
		}
		};
		
		valor2 = switch (tirada2) {
		case "UNO" -> {
			// Devolvemos 1
			yield 1;
		}
		case "DOS" -> {
			// Devolvemos 2
			yield 2;
		}
		case "TRES" -> {
			// Devolvemos 3
			yield 3;
		}
		case "CUATRO" -> {
			// Devolvemos 4
			yield 4;
		}
		case "CINCO" -> {
			// Devolvemos 5
			yield 5;
		}
		case "SEIS" -> {
			// Devolvemos 6
			yield 6;
		}
		default -> {
			// El usuario no ha introducido un valor correcto
			System.out.println("El valor de la segunda tirada es erróneo");
			yield 0;
		}
		};
		
		// Antes de devolver la suma, comprobamos que ambas tiradas han sido correctas
		if (valor1 != 0 && valor2 != 0) {
			System.out.println("La suma de las dos tiradas es: " + (valor1+valor2));
		}
	}
}
