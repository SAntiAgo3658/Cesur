package retoUd5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

	static boolean leerDeFichero(File miFichero) throws IOException {
		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();

			while (caracter != -1) {
				System.out.println((char) caracter);
				caracter = entrada.read();

			}

			return true;

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

			return false;

		} finally {
			if (entrada != null)
				entrada.close();

		}

	}

	static boolean leerDeFichero(String miFichero) throws IOException {
		FileReader entrada = null;

		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();

			while (caracter != -1) {
				System.out.println((char) caracter);
				caracter = entrada.read();

			}

			return true;

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

			return false;

		} finally {
			if (entrada != null)
				entrada.close();

		}

	}

	static boolean escribirEnFichero(String miFichero) throws IOException {
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int i = 0; i <= 10; i++) {
				salida.write((char) i);
				salida.write('\n');

			}

			return true;

		} catch (IOException e) {
			System.out.println(e.getMessage());

			return false;

		} finally {
			if (salida != null)
				salida.close();

		}

	}

	static boolean escribirEnFichero(File miFichero) throws IOException {
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int i = 0; i <= 10; i++) {
				salida.write((char) i);
				salida.write('\n');

			}

			return true;

		} catch (IOException e) {
			System.out.println(e.getMessage());

			return false;

		} finally {
			if (salida != null)
				salida.close();

		}

	}

}
