package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException {

		BufferedReader entrada = null;
		BufferedWriter salida = null;
		PrintWriter salida2 = null;

		try {
			entrada = new BufferedReader(new FileReader("Prueba Fichero.txt"));
			salida = new BufferedWriter(new FileWriter("Escribirfichero.txt"));
			salida2 = new PrintWriter(new FileWriter("Pruebafichero2.txt"));
			String linea = entrada.readLine();
			int cont = 1;

			while (linea != null) {
				
				
                if (cont % 2 == 0) {
					salida2.println(linea);
					salida.write(linea);
					
				}
				
                linea = entrada.readLine();
                cont++;

			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();

			}

			if (salida != null) {
				salida.close();

			}

			if (salida2 != null) {
				salida2.close();

			}

		}

	}

}