package practicas;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num;
		int numTemp;

		do {
			System.out.println("Introduce un número");
			num = teclado.nextInt();

		} while ((99 > num) || (num > 1000));

		int num1;
		int num2;
		numTemp = num;

		num1 = num % 10;

		num = num / 100;

		num2 = num % 10;

		num = numTemp;

		if (num1 == num2) {
			System.out.println(num + " es un número capicúa");

		} else {
			System.out.println(num + " no es un número capicúa");

		}

		teclado.close();
	}

}
