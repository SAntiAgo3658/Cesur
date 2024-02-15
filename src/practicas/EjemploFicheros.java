package practicas;

import java.io.FileInputStream;
import java.io.IOException;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException {

		// leer de un fichero caracter a caracter y lo muestro por pantalla

		FileInputStream entrada = null;
		
		

		try {
			entrada = new FileInputStream("PruebaFichero.txt");

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();

			}

		}

	}

}
