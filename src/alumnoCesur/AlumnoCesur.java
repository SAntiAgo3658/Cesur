package alumnoCesur;

public class AlumnoCesur {

	public static void main(String[] args) {

		Alumno santiago = new Alumno("Santiago", 22, "DAM");
		System.out.println(santiago.toString());
		Alumno francisco = new Alumno("Francisco", 18, "DAM");
		Alumno ramón = new Alumno("Ramón", 24, "DAM");
		Alumno andrés = new Alumno("Andrés", 20, "DAM");
		Alumno adrián = new Alumno("Adrián", 25, "DAM");
		Alumno janhin = new Alumno("Janhin", 27, "DAM");
		Alumno alejandro = new Alumno("Alejandro", 23, "DAM");
		Alumno sinram = new Alumno("Sinram", 23, "DAM");
		Alumno álvaro = new Alumno("Álvaro", 18, "DAM");
		Alumno joséRamón = new Alumno("José Ramón", 39, "DAM");
		Alumno juanCarlos = new Alumno("Juan Carlos", 24, "DAM");
		Alumno darío = new Alumno("Darío", 18, "DAM");
		Alumno barranquero = new Alumno("Barranquero", 26, "DAW");

		Clase premiumPlus = new Clase("Premium Plus");
		premiumPlus.add(darío);
		premiumPlus.add(santiago);
		premiumPlus.add(ramón);
		premiumPlus.add(andrés);
		premiumPlus.add(adrián);
		premiumPlus.add(francisco);
		premiumPlus.add(janhin);
		premiumPlus.add(alejandro);
		premiumPlus.add(sinram);
		premiumPlus.add(álvaro);
		premiumPlus.add(joséRamón);
		premiumPlus.add(juanCarlos);
		premiumPlus.add(barranquero);
		System.out.println(premiumPlus);

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			System.out.println(premiumPlus.getAlumnos()[i]);

			if (premiumPlus.getAlumnos()[i].getNombre() == "Darío") {
				darío.setEdad(17);

			}

		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Los alumnos de DAM son: ");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {

			if (premiumPlus.getAlumnos()[i].getCurso() == "DAM") {
				System.out.println(premiumPlus.getAlumnos()[i]);

			}
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Los alumnos de DAW son: ");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {

			if (premiumPlus.getAlumnos()[i].getCurso() == "DAW") {
				System.out.println(premiumPlus.getAlumnos()[i]);

			}
		}

		premiumPlus.delete(janhin.getNombre());
		System.out.println(premiumPlus);

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			System.out.println(premiumPlus.getAlumnos()[i]);

		}

	}
}
