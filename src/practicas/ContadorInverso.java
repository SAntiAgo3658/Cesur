package practicas;
import java.util.Scanner;

public class ContadorInverso { // [1200...620] de 20 en 20 (while, do while y for)

	public static void main(String[] args) {

		int x = 1200;
		int p = 0;

		Scanner teclado = new Scanner(System.in);

		while (x >= 620) {

			System.out.print(x + " ");
			x = x - 20;
		}

		x = 1200;
		System.out.println();

		do {

			System.out.print(x + " ");
			x = x - 20;

		} while (x >= 620);

		System.out.println();

		for (int i = 1200; i >= 620; i = i - 20) {

			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Introduzca el número máximo");
		int numMax = teclado.nextInt();
		int numMin;

		do {
			System.out.println("Introduzca el número mínimo");
			numMin = teclado.nextInt();

		} while (numMin >= numMax);

		System.out.println("Introduzca salto deseado");
		int salto = teclado.nextInt();

		while (numMax >= numMin) {

			p++;
			System.out.print(numMax + ", ");
			numMax = numMax - salto;
			if (p % 10 == 0) {
				System.out.println();
			}
		}

	}
}
