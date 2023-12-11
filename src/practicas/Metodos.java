package practicas;
import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {

		valoresCorrectos();
	}

	static boolean comprobarValor(int max, int min, int valor) {

		if ((min > valor) || (max < valor)) {
			return false;

		}
		return true;

	}

	static boolean comprobarEntradas(int max, int min) {

		if (max < min) {
			return false;

		}
		return true;
	}

	static void valoresCorrectos() {
		int valor = 0;
		int max = 0;
		int min = 0;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Introduzca los valores máximo y mínimo; en ese orden y con coherencia.");
			max = teclado.nextInt();
			min = teclado.nextInt();

		} while (!comprobarEntradas(max, min));

		do {
			System.out.println("Introduzca un valor correcto.");
			valor = teclado.nextInt();

		} while (!comprobarValor(max, min, valor));

		System.out.println("el valor está " + "entre " + min + " y " + max);
		System.out.println(comprobarValor(max, min, valor));

		teclado.close();

	}
}
