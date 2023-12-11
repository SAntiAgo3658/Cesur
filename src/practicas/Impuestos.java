package practicas;
import java.util.Scanner;

public class Impuestos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int ingresos = 0;
		int aPagar = 0;
		int tipo = 0;

		
			do {
				System.out.println("Introduzca sus ingresos");
				ingresos = teclado.nextInt();

			} while (ingresos < 1);
			
			if (ingresos < 30001) {
				tipo = 10;
			
			} else if ((ingresos > 30000) && (50001 > ingresos)) {
				tipo = 15;
				
			} else {
				tipo = 20;
			}
			
			System.out.println(ingresos * tipo / 100 + " " + tipo + "%");
			

		

	}
}
