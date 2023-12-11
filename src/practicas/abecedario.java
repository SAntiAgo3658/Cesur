package practicas;


public class abecedario {

	public static void main(String[] args) {

		int i = 97;

		int j = 97;

		do {

			System.out.print((char) i + (" "));
			i++;

		} while (i < 97 + 26);

		System.out.println();

		while (j < 97 + 26) {
			System.out.print((char) j + (" "));
			j++;
		}

		System.out.println();

		for (int p = 97; p < 97 + 26; p++) {
			System.out.print((char) p + (" "));

		}

	}

}
