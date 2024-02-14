package animales;

import java.util.Random;

public class UsoAnimales {

	public static void main(String[] args) {

		Animal[] animales;
		animales = new Animal[10];

		int[] enteros = new int[10];
		Random aleatorio = new Random();

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = aleatorio.nextInt(10);
			System.out.print(enteros[i] + " ");

		}

		System.out.println();

		int numero = aleatorio.nextInt(10);
		boolean encontrado = false;
		int i = 0;
		int cont = 0;

		while ((encontrado == false) && (i < enteros.length)) {
			if (numero == enteros[i]) {
				encontrado = true;
				cont++;

			} else {

				i++;

			}

		}

		if (encontrado) {

			System.out.println("Encontrado " + numero + ": " + encontrado);
			System.out.println("Número de ocurrencias: " + cont);

		} else {
			System.out.println("no encontrado");

		}

	}

}
