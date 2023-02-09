package ejemplos.bucles;

import java.util.Scanner;

/*
 *0 iteraciones -> valor num=-1 resultado obtenido=0 
 * 
 * 1 iteracion -> valor num=0 valor numero=-1 resultado obtenido=-1 
 * 
 * maximo iteraciones -> tantas como usuario desee no comprobable
 * 
 * maximo-1 iteraciones -> tantas como usuario desee no comprobable
 * 
 * maximo+1 iteraciones -> tantas como usuario desee no comprobable
 * 
 * intermedio iteraciones -> valor num=0, valor num=1 resultado obtenido=1
 * 
 */

public class Ejercicio1 {
	

	public static void main(String[] args) {
		// En suma guardaré el resultado de sumar todos los números introducidos por el
		// usuario
		int suma = 0;

		// num es el valor introducido por el usuario por teclado
		int num = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un número:
		System.out.println(
				"Introduzca un número entero positivo para sumarlo. "
				+ "Introduzca un valor negativo para salir del programa. ");

		num = sc.nextInt();
		while (num >= 0) {

			// Le añado a la variable el valor de num
			suma += num;

			// Le vuelvo a pedir al usuario un número
			num = sc.nextInt();
		}
		// Imprimo el resultado de la suma
		System.out.println("La suma total de los números introducidos es: " + suma);

		sc.close();
	}

}
