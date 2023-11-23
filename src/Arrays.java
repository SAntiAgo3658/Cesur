import java.util.Random;

public class Arrays {

	public static void main(String[] args) {

		Random aleatorio = new Random();

		int[] listaInteger = new int[10];
		int numPares = 0;
		int[] listaPares;
		int numImpares = 0;
		int[] listaImpares;
		int x;
		int p;
		int tmp = 0;
		int m;

		for (int i = 0; i < listaInteger.length; i++) {
			listaInteger[i] = aleatorio.nextInt();

		}

		for (int i = 0; i < listaInteger.length; i++) {

			if ((listaInteger[i] % 2) == 0) {
				numPares = numPares + 1;

			} else {
				numImpares = numImpares + 1;

			}

		}

		System.out.println(numPares);
		System.out.println(numImpares);
		listaPares = new int[numPares];
		listaImpares = new int[numImpares];
		x = 0;
		p = 0;

		for (int i = 0; i < listaInteger.length; i++) {
			if ((listaInteger[i] % 2) == 0) {
				listaPares[x] = listaInteger[i];
				x++;

			} else {
				listaImpares[p] = listaInteger[i];
				p++;

			}

		}

		for (int i = 0; i < listaPares.length; i++) {

			for (int j = 0; j < (listaPares.length - 1 - i); j++) {

				if (listaPares[j] < listaPares[j + 1]) {
					tmp = listaPares[j + 1];
					listaPares[j + 1] = listaPares[j];
					listaPares[j] = tmp;
				}
			}
		}

		tmp = 0;

		for (int i = 0; i < listaImpares.length; i++) {

			for (int j = 0; j < (listaImpares.length - 1 - i); j++) {

				if (listaImpares[j] < listaImpares[j + 1]) {
					tmp = listaImpares[j + 1];
					listaImpares[j + 1] = listaImpares[j];
					listaImpares[j] = tmp;

				}
			}
		}
		
		for (int i = 0; i < listaPares.length; i++) {
			listaInteger[i] = listaPares[i];
		}
		
		m = 0;
		
		for (int i = numPares; i < listaInteger.length; i++) {
			listaInteger[i] = listaImpares[m];
			m++;
		}
		
	}

}
