package practicas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException {

		// leer de un fichero caracter a caracter y lo muestro por pantalla

		FileInputStream entrada = null;
		FileOutputStream salida = null;
		

		try {
			entrada = new FileInputStream("Prueba Fichero.txt");
			int ascii;
			ascii = entrada.read();
			while (ascii != -1) {
				System.out.print((char) ascii);
				ascii = entrada.read();

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();

			}

		}
		
		try {
			salida = new FileOutputStream("Prueba Fichero.txt");
			salida.write(72);
	

			

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			if (salida != null) {
				salida.close();

			}

		}


	}

}