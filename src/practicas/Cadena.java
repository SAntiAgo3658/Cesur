package practicas;

public class Cadena {

	public static void main(String[] args) {

		String cadena = "Hola mundo";

		for (int i = 0; i < cadena.length(); i++) {

			if (i % 2 == 0) {

				ImpresionCaracter(cadena.toUpperCase(), i);

			} else {

				ImpresionCaracter(cadena.toLowerCase(), i);

			}

		}
	}

	static void ImpresionCaracter(String cadena, int indice) {
		System.out.println(cadena.charAt(indice));

	}
}
