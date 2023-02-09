package ejemplos.bucles;

import java.util.Scanner;

/*
 * 0 iteraciones -> valor num=-1 resultado obtenido=0 
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


public class Ejercicio7 {

	public static void main(String[] args) {
		int numero;
		int factorial=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un entero positivo.");
		numero = sc.nextInt();
		
		if(numero>=0) {
			for(int i=numero; i>=1; i--) {
				factorial *= i;
			}
			
			System.out.println("El factorial es: " + factorial);
		} else {
			System.out.println("No ha introducido un número positivo.");
		}
		sc.close();
	}
}
