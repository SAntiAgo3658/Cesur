package practicas;

import java.util.Scanner;

public class NumeroCifras {

	public static void main(String[] args) {

		int num;
		int cifras = 1;
		int cifraUltima;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca un número");
			num = teclado.nextInt();

		} while (num < 0);

		cifraUltima = num % 10;

		while (num / 10 != 0) {
			cifras++;
			num = num / 10;

		}

		System.out.println(cifras);
		System.out.println("Primera cifra: " + num);
		System.out.println("Última cifra: " + cifraUltima);

		teclado.close();

	}

}
