
public class Cadenas2 {

	public static void main(String[] args) {
        
		String cadena = "hola";
		boolean verdad = true;
		
		System.out.println(uneCadenas("hola", "mundo"));
		cadena = pasoCadena(cadena, verdad);
		System.out.println(cadena);
		System.out.println(numOcurrenciasChar("calabaza", 'a'));
		System.out.print(uneCadenas("hola", "Javier"));
		System.out.println(uneCadenas("hola", "David"));

	}

	static String uneCadenas(String cadena1, String cadena2) {

		return (cadena1 + cadena2);

	}

	static String pasoCadena(String cadena, boolean mayusculas) {

		if (mayusculas) {
			return cadena.toUpperCase();

		} else {
			return cadena.toLowerCase();

		}

	}

	static int numOcurrenciasChar(String cadena, char caracter) {

		int num = 0;

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == caracter) {
				num++;

			}
		}

		return num;

	}

}
