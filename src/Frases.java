import java.util.Scanner;

public class Frases {

	final static int CANTIDAD = 10;

	static String[] cadenas = new String[CANTIDAD];

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < CANTIDAD; i++) {
			System.out.println("Escribe una cadena de caracteres para la posición: " + i);
			setValue(cadenas, i, teclado.nextLine());

		}

		for (int i = 0; i < CANTIDAD; i++) {
			System.out.print("[ " + getValue(cadenas, i) + " ]");

		}

		teclado.close();

	}

	String getValue(int posición) {

		return cadenas[posición];

	}

	static String getValue(String[] cadenas, int posición) {

		return cadenas[posición];

	}

	static void setValue(String[] cadenas, int posición, String newCadena) {

		cadenas[posición] = newCadena;

	}

	public static void imprimirArrays(String[] array) {

		System.out.print("[  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");

		}

		System.out.println("]");

	}

}
