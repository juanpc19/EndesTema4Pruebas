package ejemplos.bucles;

import java.util.Scanner;

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
