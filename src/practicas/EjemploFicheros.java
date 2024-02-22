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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import animales.Animal;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectOutputStream salida = null;
		Animal perro = new Animal("Perro", 32);
		Animal gato = new Animal("Gato", 17);

		try {
			salida = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("Escribirficheroobjeto.txt")));
			salida.writeObject(perro);
			salida.writeObject(gato);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (salida != null)
				salida.close();

		}

		ObjectInputStream entrada = null;
		Animal generico;

		try {
			entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Escribirficheroobjeto.txt")));
			generico = (Animal) entrada.readObject();
			System.out.println(generico.getNombre());
			generico = (Animal) entrada.readObject();
			System.out.println(generico.getNombre());
			generico.setTmpvida(16);
			perro.setTmpvida(120);
			System.out.println(generico.getTmpvida());
			System.out.println(perro.getTmpvida());
			System.out.println(gato.getTmpvida());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null)
				entrada.close();

		}

	}

}
