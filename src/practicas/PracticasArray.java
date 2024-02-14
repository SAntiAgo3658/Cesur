package practicas;

import java.util.Scanner;
import java.util.Random;

public class PracticasArray {

	public static void main(String[] args) {

		// Pedir por teclado el tamaño del array
		// Construir array de integers de ese tamaño
		// Pedir rango de valores que se quieren introducir
		// Máximo y mínimo del rango
		// Intrducir esos valores en el array de forma aleatoria hasta llenarlo
		// Valores positivos

		int[] array;
		int tamaño;
		int max;
		int min;
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		do {
			System.out.println("Introduce un valor positivo para el tamaño del array:");
			tamaño = teclado.nextInt();

		} while (tamaño < 0);

		array = new int[tamaño];

		do {
			System.out.println("Introduce un valor positivo para el maximo de los números del array:");
			max = teclado.nextInt();

		} while (max < 0);

		do {
			System.out.println("Introduce un valor positivo para el minimo de los números del array:");
			min = teclado.nextInt();

		} while (min < 0);

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			array[i] = min + (aleatorio.nextInt(max - min + 1));
			System.out.println(array[i] + " ");

		}

		int[] arraypares;
		int[] arrayimpares;
		int numpares = 0;
		int numimpares = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				numpares++;

			} else {
				numimpares++;

			}

		}

		System.out.println("Número de pares: " + numpares);
		System.out.println("Número de impares: " + numimpares);
		System.out.println();

		arraypares = new int[numpares];
		arrayimpares = new int[numimpares];
		int contpares = 0;
		int contimpares = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arraypares[contpares] = array[i];
				contpares++;

			} else {
				arrayimpares[contimpares] = array[i];
				contimpares++;

			}

		}

		System.out.print("array impares: ");

		for (int i = 0; i < arrayimpares.length; i++) {
			System.out.print(arrayimpares[i] + " ");

		}

		System.out.println();
		System.out.print("array pares: ");

		for (int i = 0; i < arraypares.length; i++) {
			System.out.print(arraypares[i] + " ");

		}

		teclado.close();

	}

}
