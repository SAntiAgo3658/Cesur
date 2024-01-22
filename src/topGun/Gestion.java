package topGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "capitán");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "teniente");
		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Introduzca datos del piloto nº 4 con el orden(id(coincide con el nºdel piloto), nombre, horas, rango:");
		Piloto piloto4 = new Piloto(teclado.nextInt(), teclado.next(), teclado.nextInt(), teclado.next());

		System.out.println(
				"Introduzca datos del piloto nº 5 con el orden(id(coincide con el nºdel piloto), nombre, horas, rango:");
		Piloto piloto5 = new Piloto(teclado.nextInt(), teclado.next(), teclado.nextInt(), teclado.next());

		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();

		Avion avion1 = new Combate(1, "caza", 1, piloto1, true);
		Avion avion2 = new Combate(2, "Blackhawk", 15, piloto2, false);
		Avion avion3 = new Entrenamiento(3, "Pilatus", 21, piloto3, true);

		System.out.println(
				"Introduzca datos del avión nº 4(de entrenamiento) con el orden(id(coincide con el nºdel avión), modelo, capacidad, doble mando(true o false:");
		Avion avion4 = new Entrenamiento(teclado.nextInt(), teclado.next(), teclado.nextInt(), piloto4,
				teclado.nextBoolean());

		System.out.println(
				"Introduzca datos del avión nº 5(de entrenamiento) con el orden(id(coincide con el nºdel avión), modelo, capacidad, doble mando(true o false:");
		Avion avion5 = new Entrenamiento(teclado.nextInt(), teclado.next(), teclado.nextInt(), piloto5,
				teclado.nextBoolean());
		
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
