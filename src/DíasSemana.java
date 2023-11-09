import java.util.Scanner;

public class DíasSemana {
	
     public static void main(String[] args) {

		int mes = 0;
		int semana = 0;
		int díaSemana = 0;
		int num = 0;
		Scanner teclado = new Scanner (System.in);
		int mesCompleto = 0;
		
		
		 do {  
			 System.out.print("Introduzca un número correcto");
		num = teclado.nextInt();
		
		
		    } while (336 < num || num < 1);
		 
		 mesCompleto = num / 28;
		 
		 
		 
		 
	
		    
			
		
        while (mes < mesCompleto) {

			if (mes == 0) {
				System.out.print("ENERO.      ");

			} else if (mes == 1) {
				System.out.print("FEBRERO.    ");

			} else if (mes == 2) {
				System.out.print("MARZO.      ");

			} else if (mes == 3) {
				System.out.print("ABRIL.      ");

			} else if (mes == 4) {
				System.out.print("MAYO.       ");

			} else if (mes == 5) {
				System.out.print("JUNIO.      ");

			} else if (mes == 6) {
				System.out.print("JULIO.      ");

			} else if (mes == 7) {
				System.out.print("AGOSTO.     ");

			} else if (mes == 8) {
				System.out.print("SEPTIEMBRE. ");

			} else if (mes == 9) {
				System.out.print("OCTUBRE.    ");

			} else if (mes == 10) {
				System.out.print("NOVIEMBRE.  ");

			} else if (mes == 11) {
				System.out.print("DICIEMBRE.  ");

			}

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
				 System.out.print("] ");

				 semana = semana + 1;

				 díaSemana = 0;

			}
			 System.out.println();
			 
			 semana = 0;
			 
			 mes = mes + 1;
		}
	}
}
