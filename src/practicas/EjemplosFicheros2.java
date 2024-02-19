package practicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjemplosFicheros2 {

	public static void main(String[] args) throws IOException {

		// pedir una frase por pantalla e intoducirla en el fichero: Prueba Fichero.txt
		// mostrar por pantalla el contenido del fichero

		FileInputStream entrada = null;
		FileOutputStream salida = null;
		Scanner teclado = new Scanner(System.in);
		String contenido;
		char[] guarda = null;

		System.out.println("Introduce el contenido");
		contenido = teclado.nextLine();
		guarda = new char[contenido.length()];

		for (int i = 0; i < guarda.length; i++) {
			guarda[i] = contenido.charAt(i);

		}

		try {
			salida = new FileOutputStream("Prueba Fichero.txt");

			for (int i = 0; i < guarda.length; i++) {
				salida.write((int) guarda[i]);

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			if (salida != null) {
				salida.close();

			}

		}

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

		teclado.close();

	}

}