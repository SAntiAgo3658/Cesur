package practicas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException {

		// Trabajar con caracteres
		// Lectura de un fichero: "Prueba fichero.txt"
		// Escritura de un fichero:
		// Escritura de un fichero, al final del mismo.

		// Flujo de lectura:
		FileReader entrada = null;
		boolean nofin = true;
		char caracter;

		try {
			entrada = new FileReader("Prueba fichero.txt");

			do {
				caracter = (char) entrada.read();

				if (caracter == (char) -1) {
					nofin = false;

				} else {

					System.out.print(caracter);

				}

			} while (nofin);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();

			}

		} // Fin try-catch

		FileOutputStream salida = null;
		String frase = "esto es una prueba de escritura en fichero";
		char[] fraseArray = new char[frase.length()];

		for (int i = 0; i < frase.length(); i++) {
			fraseArray[i] = frase.charAt(i);

		}

		try {
			salida = new FileOutputStream("Prueba fichero.txt");

			for (int i = 0; i < fraseArray.length; i++) {
				salida.write((int) fraseArray[i]);

			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (salida != null) {
				salida.close();

			}

		} // Final try-catch

		System.out.println();
		System.out.println();

		FileWriter fw = null;
		Scanner teclado = new Scanner(System.in);

		try {
			fw = new FileWriter("Prueba fichero.txt", true); // opción append habilitada!
			String meteFrase;
			fw.write((int) '\n');

			do {
				System.out.println("Introduzca una frase");
				meteFrase = teclado.nextLine();
				System.out.println(meteFrase);

				if (meteFrase.length() > 0) {
					for (int i = 0; i < meteFrase.length(); i++) {
						fw.write(meteFrase.charAt(i));

					}

				}

				fw.write((int) '\n');

			} while (((meteFrase.charAt(0) != 'Q') || (meteFrase.length() != 1)) && (meteFrase.length() > 0));

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			if (fw != null) {
				fw.close();

			}

		}
		
		FileReader entrada2 = null;
		boolean nofin2 = true;
		char caracter2;

		try {
			entrada2 = new FileReader("Prueba fichero.txt");

			do {
				caracter2 = (char) entrada2.read();

				if (caracter2 == (char) -1) {
					nofin2 = false;

				} else {

					System.out.print(caracter2);

				}

			} while (nofin2);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada2 != null) {
				entrada2.close();

			}

		} // Fin try-catch

		teclado.close();

	}

}