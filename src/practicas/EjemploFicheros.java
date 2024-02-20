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

		FileReader entrada = null;
		try {
			entrada = new FileReader("Prueba Fichero.txt");
			char caracter = (char) entrada.read();

			while (caracter != (char) -1) {
				System.out.print(caracter);
				caracter = (char) entrada.read();

				Scanner teclado = new Scanner(System.in);

			}

		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha sido encontrado");

		} finally {
			if (entrada != null) {
				entrada.close();

			}

		}

		entrada = null;
		Scanner teclado = new Scanner(System.in);

		try {
			entrada = new FileReader("Prueba Fichero.txt");
			System.out.println("Introduce el número de filas que quiere imprimir");
			int numFilas = teclado.nextInt();
			char caracter2 = (char) entrada.read();

			while ((caracter2 != (char) -1) && (numFilas != 0)) {
				System.out.print(caracter2);
				caracter2 = (char) entrada.read();

				if (caracter2 == '\n') {
					numFilas--;

				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha sido encontrado");

		} finally {
			if (entrada != null) {
				entrada.close();

			}

		}

		teclado.close();

	}

}