package practicas;

import java.util.Scanner;

public class DosNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;

		System.out.println("Introduce primer numero: ");
		num1 = teclado.nextInt();

		System.out.println("Introduce segundo numero: ");
		num2 = teclado.nextInt();

		System.out.print("¿Los dos números empiezan por la misma cifra?: ");
		System.out.println(NumeroCifras.primeraCifra(num1) == NumeroCifras.primeraCifra(num2));
		System.out.print("¿Los dos números terminan por la misma cifra?: ");
		System.out.println(NumeroCifras.ultimaCifra(num1) == NumeroCifras.ultimaCifra(num2));

		teclado.close();

	}

}