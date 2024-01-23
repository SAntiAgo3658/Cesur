package topGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		Piloto piloto1 = new Piloto("Pete Maverick", 10000, "capitán");
		Piloto piloto2 = new Piloto("Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto("Bradley Rooster", 3500, "teniente");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca datos del piloto nº 4 (rango):");
        String rango4 = teclado.nextLine();
        
		System.out.println("Introduzca datos del piloto nº 4 (nombre):");
		String nombre4 = teclado.nextLine();

		System.out.println("Introduzca datos del piloto nº 4 (horas):");
		
		Piloto piloto4 = new Piloto(nombre4, teclado.nextInt(), rango4);

		System.out.println("Introduzca datos del piloto nº 5 (rango):");
        String rango5 = teclado.nextLine();
        
        System.out.println("Introduzca datos del piloto nº 5 (nombre):");
		String nombre5 = teclado.nextLine();
		
        System.out.println("Introduzca datos del piloto nº 4 (horas):");
		
		Piloto piloto5 = new Piloto(nombre5, teclado.nextInt(), rango5);

		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();

		Avion avion1 = new Combate("caza", 1, piloto1, true);
		Avion avion2 = new Combate("Blackhawk", 15, piloto2, false);
		Avion avion3 = new Entrenamiento("Pilatus", 21, piloto3, true);

		System.out.println(
				"Introduzca datos del avión nº 4(de entrenamiento), modelo, capacidad, doble mando(true o false:");
		Avion avion4 = new Entrenamiento(teclado.next(), teclado.nextInt(), piloto4, teclado.nextBoolean());

		System.out.println(
				"Introduzca datos del avión nº 5(de entrenamiento), modelo, capacidad, doble mando(true o false:");
		Avion avion5 = new Entrenamiento(teclado.next(), teclado.nextInt(), piloto5, teclado.nextBoolean());

		avion1.mostrarAvion();
		System.out.println();
		avion2.mostrarAvion();
		System.out.println();
		avion3.mostrarAvion();
		System.out.println();
		avion4.mostrarAvion();
		System.out.println();
		avion5.mostrarAvion();

		teclado.close();

	}

}
