package practicas;


import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		Random aleatorio;
		aleatorio = new Random();

		int filas = (int) (aleatorio.nextDouble() * 10 + 1); // [3..16]

		filas = 5;
		for (int m = 0; m < filas; m++) {

			for (int i = 0; i < filas; i++) {

				for (int k = 0; k < (filas - m - 1); k++) {
					System.out.print(" ");
				}

				for (int j = 0; j < (m); j++) {

					System.out.print("*");
				}

				for (int l = 0; l < (m); l++) {
					System.out.print("*");

				}
				System.out.print("*");
				for (int d = 0; d < (filas - m - 1); d++) {
					System.out.print(" ");
				}
			}

			System.out.println();

		}

		for (int g = 0; g < filas - 1; g++) {
			for (int w = 0; w < filas; w++) {

				for (int k = 0; k < g + 1; k++) {
					System.out.print(" ");
				}

				for (int j = 0; j < (filas - g - 2); j++) {

					System.out.print("*");
				}

				for (int l = 0; l < (filas - g - 2); l++) {
					System.out.print("*");

				}
				System.out.print("*");
				for (int d = 0; d < (g + 1); d++) {
					System.out.print(" ");
				}

				System.out.println();
			}
		}
	}
}
