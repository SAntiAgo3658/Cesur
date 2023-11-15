import java.util.Scanner;

public class OrdenNúmeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0; // descendente o ascendente.

		System.out.println("Introduzca tres números");

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		do {
			System.out.print("pulse 1 para orden descendente ó 2 para orden ascendente");
			d = teclado.nextInt();

		} while ((d != 1) && (d != 2));

		if (d == 1) {

			if (a >= b) {

				if (a >= c) {
					System.out.print(a + " ");

					if (b >= c) {
						System.out.print(b + " ");
						System.out.print(c);

					} else if (c > b) {
						System.out.print(c + " ");
						System.out.print(b);

					}

				} else if (c > a) {
					System.out.print(c + " ");
					System.out.print(a + " ");
					System.out.print(b);
				}

			} else if (b > a) {

				if (b >= c) {
					System.out.print(b + " ");

					if (a >= c) {
						System.out.print(a + " ");
						System.out.print(c);

					} else if (c > a) {
						System.out.print(c + " ");
						System.out.print(a);

					}

				} else if (c > b) {
					System.out.print(c + " ");
					System.out.print(b + " ");
					System.out.print(a);
				}
			}

		} else if (d == 2) {

			if (a <= b) {

				if (a <= c) {
					System.out.print(a + " ");

					if (b <= c) {
						System.out.print(b + " ");
						System.out.print(c);

					} else if (c < b) {
						System.out.print(c + " ");
						System.out.print(b);

					}

				} else if (c < a) {
					System.out.print(c + " ");
					System.out.print(a + " ");
					System.out.print(b);
				}

			} else if (b < a) {

				if (b <= c) {
					System.out.print(b + " ");

					if (a <= c) {
						System.out.print(a + " ");
						System.out.print(c);

					} else if (c < a) {
						System.out.print(c + " ");
						System.out.print(a);

					}

				} else if (c < b) {
					System.out.print(c + " ");
					System.out.print(b + " ");
					System.out.print(a);
				}
			}

		}

	}

}
