package practicas;

import java.util.Scanner;

public class NumeroCifras {

	public static void main(String[] args) {

		int num;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca un número");
			num = teclado.nextInt();

		} while (num < 0);

		System.out.println("Número de cifras: " + totalCifras(num));
		System.out.println("Primera cifra: " + primeraCifra(num));
		System.out.println("Última cifra: " + ultimaCifra(num));

		teclado.close();

	}

	public static int ultimaCifra(int num) {

		int cifraUltima;
		cifraUltima = num % 10;
		return cifraUltima;

	}

	public static int totalCifras(int num) {

		int cifras = 1;

		while (num / 10 != 0) {
			cifras++;
			num = num / 10;

		}

		return cifras;

	}

	public static int primeraCifra(int num) {

		return (num / (int) Math.pow(10, totalCifras(num) - 1));

	}

}
