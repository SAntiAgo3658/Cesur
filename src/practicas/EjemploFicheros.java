package practicas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException {

		DataOutputStream salida = null;
		try {
			salida = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Escribirfichero.txt")));
			salida.writeChar('a');
			salida.writeBoolean(true);
			salida.writeUTF("Frase en UTF");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (salida != null)
				salida.close();

		}

		DataInputStream entrada = null;

		try {
			entrada = new DataInputStream(new BufferedInputStream(new FileInputStream("Escribirfichero.txt")));
			System.out.println(entrada.readChar());
			System.out.println(entrada.readBoolean());
			System.out.println(entrada.readUTF());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null)
				entrada.close();

		}

	}

}
