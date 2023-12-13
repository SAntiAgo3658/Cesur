package alumnoCesur;

import practicas.Creator;
import java.util.Random;

public class AlumnoCesur {

	public static void main(String[] args) {

		// CESUR ESTE
		CentroEstudio cesurEste = new CentroEstudio("CESUR El Palo", 5, 4);
		Random aleatorio = new Random();
		String nombreClaseTemp;
		System.out.println(cesurEste);
		System.out.println();
		System.out.println();

		for (int i = 0; i < 5; i++) {
			nombreClaseTemp = Creator.newClase();
			Clase claseTemp = new Clase(nombreClaseTemp);
			claseTemp.setProfesor(new Profesor(Creator.newName(), Creator.newAge(), nombreClaseTemp));

			for (int x = 0; x < 1 + aleatorio.nextInt(Clase.getTotalalumnos() - 1); x++) {
				claseTemp.add(new Alumno(Creator.newName(), Creator.newAge(), nombreClaseTemp));
				System.out.println(claseTemp.getAlumnos()[x]);

			}

			cesurEste.getClases()[i] = claseTemp;
			System.out.println(cesurEste.getClases()[i]);
			System.out.println();

		}

		for (int i = 0; i < 4; i++) {
			cesurEste.getAdministrativos()[i] = new Administrativo(Creator.newName(), Creator.newAge(),
					aleatorio.nextBoolean());
			System.out.println(cesurEste.getAdministrativos()[i]);

		}

		// FIN CESUR ESTE

		// CESUR PTA
		CentroEstudio cesurPTA = new CentroEstudio("Cesur del PTA");

		// FIN CESUR PTA

	}// FIN MAIN

}// FIN CLASE