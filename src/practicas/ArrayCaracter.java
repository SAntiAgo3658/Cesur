package practicas;

import java.util.Scanner;
import java.util.Random;

public class ArrayCaracter {

	public static void main(String[] args) {

		char[] arraychar;
		int tamaño;
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		do {
			System.out.println("Introduce un valor positivo para el tamaño del array:");
			tamaño = teclado.nextInt();

		} while (tamaño < 0);

		arraychar = new char[tamaño];
		int ascii = 0;
		char a;

		for (int i = 0; i < arraychar.length; i++) {
			ascii = aleatorio.nextInt(97, 122);
			a = (char) ascii;
			arraychar[i] = a;
			System.out.println(arraychar[i] + " ");

		}

		char busca;

		do {
			System.out.println("Selecciona el caracter a buscar(introduzca un número entre 97 y 122): ");
			busca = (char) teclado.nextInt();

		} while ((busca < 97) && (busca > 122));

		int veces = 0;

		for (int i = 0; i < arraychar.length; i++) {
			if (arraychar[i] == busca) {
				veces++;

			}

		}

		System.out.println("El carácter seleccionado aparece: " + veces + " veces");

	}

}
