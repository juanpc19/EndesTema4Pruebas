package ejemplos.bucles;

public class TablaMultiplicar {

	public static void main(String[] args) {
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.println("\nTABLA DE MULTIPLICAR DEL " + tabla);
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + (tabla*i));
			}
		}
	}

}
