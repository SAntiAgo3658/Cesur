package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListaYoutube {

	public static void main(String[] args) throws IOException {

		// 13 bloques
		// Cada bloque tiene 9 líneas
		// Me interesa líneas 1, 3, 5
		// 2, 4, 6, 7, 8, 9
		// Cada línea que me interesa la almaceno en un String
		// Al final de cada bloque almaceno en otro fichero la unión de las 3 líneas
		// Orden: num - nombre - tiempo
		// Creamos un directorio dentro del workspace y ahí almacenamos el fin.txt

		BufferedReader lector = null;
		BufferedWriter escritor = null;
		File directorio = null;
		String num = null;
		String tiempo = null;
		String nombre = null;
		String frase = null;
	
		try {

			directorio = new File("dirFinal");
			directorio.mkdir();
			lector = new BufferedReader(new FileReader("ListaYt.txt"));
			escritor = new BufferedWriter(new FileWriter(directorio.getAbsolutePath() + "//ListaYtFin.txt", true));

			for (int j = 0; j < 13; j++) {
				for (int i = 0; i < 9; i++) {
					if (i == 0) {
						num = lector.readLine(); // Línea 1

					} else if (i == 2) {
						tiempo = lector.readLine(); // Línea 3

					} else if (i == 4) {
						nombre = lector.readLine(); // Línea 5

					} else {
						lector.readLine(); // Líneas que no me interesan

					}

				}

				frase = num + " - " + nombre + " - " + tiempo;
				escritor.write(frase + "\n");
			

			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (lector != null)
				lector.close();

			if (escritor != null)
				escritor.close();

		}

	}

}
