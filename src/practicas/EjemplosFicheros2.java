package practicas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class EjemplosFicheros2 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile fichero = null;
		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "rw");

			for (int i = 0; i < 26; i++) {
				fichero.writeChar(97 + i);

			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (fichero != null)
				fichero.close();

		}

		try {
			fichero = new RandomAccessFile("ficheroAleatorio.txt", "r");

			for (int i = 0; i < 26; i++) {
				System.out.print("[" + fichero.readChar() + " " +  fichero.getFilePointer() + "]" + " ");

			}
			
			System.out.println("\nEl puntero acaba en la posición " + fichero.getFilePointer());
			fichero.seek(0);
			 
			for (int i = 0; i < 26 ; i++) {
				fichero.skipBytes(1);
				System.out.print("[" + (char) fichero.readByte() + " " +  fichero.getFilePointer() + "]" + " ");
				
			}
			
			System.out.println("\nEl puntero acaba en la posición " + fichero.getFilePointer());
	

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (fichero != null)
				fichero.close();

		}

	}

}