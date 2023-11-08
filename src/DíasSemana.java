
public class DíasSemana {

	public static void main(String[] args) {

		int num = 1;
		int mes = 0;
		int semana = 0;
		int díaSemana = 0;

		while (mes < 12) {
			
			System.out.print(num + ". ");
			num = num + 1;

			while (semana < 4) {

				System.out.print("[");

				while (díaSemana < 7) {

					if (díaSemana == 0) {
						System.out.print("L" + " ");

					} else if (díaSemana == 1) {
						System.out.print("M" + " ");

					} else if (díaSemana == 2) {
						System.out.print("x" + " ");

					} else if (díaSemana == 3) {
						System.out.print("J" + " ");

					} else if (díaSemana == 4) {
						System.out.print("V" + " ");

					} else if (díaSemana == 5) {
						System.out.print("S" + " ");

					} else if (díaSemana == 6) {
						System.out.print("D");
					}

					díaSemana = díaSemana + 1;

				}
				System.out.print("]");

				semana = semana + 1;

				díaSemana = 0;

			}
			System.out.println();
			semana = 0;
			mes = mes + 1;
		}
	}
}
