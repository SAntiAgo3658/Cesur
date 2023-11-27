
public class Cadena {

	public static void main(String[] args) {

		String cadena = "Hola mundo";
		int indice = 0;

		ImpresionCaracter(cadena, indice);

	}

	static void ImpresionCaracter(String cadena, int indice) {
		
		for (int i = 0; i < cadena.length(); i++) {
			indice = i;
			System.out.println(cadena.charAt(i));
		}
	}
}
