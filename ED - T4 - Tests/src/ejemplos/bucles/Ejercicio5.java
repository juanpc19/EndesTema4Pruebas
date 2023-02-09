package ejemplos.bucles;

import java.util.Scanner;

/*
 * CODIGO INCORRECTO: cambio mayor por menor en el if y en el if else
 * 
 * 0 iteraciones -> bucle do while siempre hace al menos 1 iteracion, no se puede hacer
 * 
 * 1 iteracion -> valor respuesta=IGUAL resultado obtenido=¡¡ENHORABUENA!! Has acertado
 * 
 * maximo iteraciones -> tantas como usuario desee no comprobable
 * 
 * maximo-1 iteraciones -> tantas como usuario desee no comprobable
 * 
 * maximo+1 iteraciones -> tantas como usuario desee no comprobable
 * 
 * intermedio iteraciones -> valor respuesta=IGUAL valor respuesta=MENOR valor respuesta=MAYOR
 * resultado obtenido= ¡¡ENHORABUENA!! Has acertado
 * 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero;
		String respuesta="";
		Scanner sc = new Scanner(System.in);
		int menor=0;
		int mayor=101;
		do {
			numero = (int)(Math.random()*(mayor-menor)+menor);
			System.out.println("¿Es el número " + numero + "?");
			respuesta = sc.nextLine();
			
			if(respuesta.equals("MAYOR")) {
				menor = numero;
			} else if(respuesta.equals("MENOR")) {
				mayor = numero;
			}
			
		}while(!respuesta.equals("IGUAL"));
		
		System.out.println("¡¡ENHORABUENA!! Has acertado");
	}

}
