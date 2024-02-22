package practicas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjemplosFicheros2 {

	public static void main(String[] args) throws IOException {

		File fichero = null;
		fichero = new File("pruebaFile");
		System.out.println(fichero.getAbsolutePath());
		System.out.println(fichero.getCanonicalPath());

		File miDirectorio = null;
		miDirectorio = new File("C:\\Users\\SantiagoElíasDavidGo\\eclipse-workspace\\DAMCesur");
		File[] miLista = miDirectorio.listFiles();

		for (int i = 0; i < miLista.length; i++) {

			if (miLista[i].isDirectory()) {
				System.out.println("DIRECTORIO:     " + miLista[i].getName());

			} else {
				System.out.println(miLista[i].getName());
				
			}

		}

	}

}