package practicas;
import java.util.Scanner;

public class UsoMétodos {

	static final int TOTALNUM = 10;
	static int[] arrayEnteros = new int[TOTALNUM];

	public static void main(String[] args) {

		pideNumeros();
		imprimirPares();
		arrayPares();
		arrayACeros();
		eligeTú(100);
		valoresDesde(99);
	}

//1.
	static void pideNumeros() {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Introduzca un número");
			arrayEnteros[i] = teclado.nextInt();

		}

		teclado.close();

	}

//2.
	static void imprimirPares() {

		System.out.print("[ ");

		for (int i = 0; i < arrayEnteros.length; i++) {

			if (arrayEnteros[i] % 2 == 0) {
				System.out.print(arrayEnteros[i] + "  ");

			}
		}

		System.out.println("]");

	}

//3.
	static void arrayPares() {

		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] != 0) {
				arrayEnteros[i] = arrayEnteros[i] + 1;

			}
		}

		System.out.print("[  ");
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.print(arrayEnteros[i] + "  ");

		}

		System.out.println("]");

	}

//4.
	static void arrayACeros() {

		System.out.print("[  ");

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = 0;
			System.out.print(arrayEnteros[i] + "  ");

		}

		System.out.println("]");
	}

//5.
	static void eligeTú(int x) {

		System.out.print("[  ");

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = x;
			System.out.print(arrayEnteros[i] + "  ");
		}

		System.out.println("]");
	}

//6.
	static void valoresDesde(int x) {

		if (x % 2 != 0) {
			x++;

		}

		System.out.println("[  ");

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = x;
			x = x + 2;
			System.out.print(arrayEnteros[i] + "  ");

		}

		System.out.println("]");

	}

}
