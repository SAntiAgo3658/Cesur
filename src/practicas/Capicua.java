package practicas;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num;
		int numTemp;
		int numFinal = 0;
		int digito;

		System.out.println("Introduce un número");
		num = teclado.nextInt();

		if ((num / 10) == 0) {

			System.out.println(num + " es un número capicúa");

		} else {

			numTemp = num;

			do {
				digito = numTemp % 10;
				numTemp = numTemp / 10;
				numFinal = (numFinal + digito) * 10;

			} while (numTemp / 10 != 0);

			numFinal = numFinal + numTemp;

			if (numFinal == num) {
				System.out.println(num + " es un número capicúa");

			} else {
				System.out.println(num + " no es un número capicúa");

			}

		}

		teclado.close();

	}

}
