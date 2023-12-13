package alumnoCesur;

class Clase {

	private int numAlumnos;
	private Alumno[] alumnos;
	private static int TOTALALUMNOS = 15;
	private String nombre;
	private Profesor profesor;

	public Clase(String nombre) {
		alumnos = new Alumno[TOTALALUMNOS];
		numAlumnos = 0;
		this.nombre = nombre;

	}

	public Profesor getProfesor() {
		return profesor;

	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;

	}

	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;

	}

	public int getNumAlumnos() {
		return numAlumnos;

	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;

	}

	public Alumno[] getAlumnos() {
		return alumnos;

	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;

	}

	public void add(Alumno alumno) {

		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = alumno;
			numAlumnos++;

		}

	}

	public String toString() {
		return "[Clase: " + nombre + "Profesor: " + profesor + ", NumAlumnos: " + numAlumnos + "]";

	}

	public void delete(String nombreAlumno) {

		int i = 0;
		boolean encontrado = false;

		while (!encontrado && (i < numAlumnos)) {

			if (alumnos[i].getNombre() == nombre) {
				encontrado = true;

			} else {
				i++;

			}

		}

		if (encontrado) {
			numAlumnos--;

			for (int x = i; x < numAlumnos; x++) {
				alumnos[x] = alumnos[x + 1];
			}

			alumnos[numAlumnos] = null;

		} else {
			System.out.println("El alumno seleccionado no se encuentra en esta clase");

		}

	}

	public void delete(Alumno alumno) {

		Alumno[] alumnosTemp = new Alumno[TOTALALUMNOS];
		int numAlumTemp = 0;

		for (int i = 0; i < numAlumnos; i++) {

			if (alumnos[i] != alumno) {
				alumnosTemp[numAlumTemp] = alumnos[i];
				numAlumTemp++;

			}

		}

		if (numAlumTemp < numAlumnos) {
			alumnos = alumnosTemp;
			numAlumnos--;

		} else {
			System.out.println("El alumno seleccionado no se encuentra en esta clase");

		}

	}

} // fin class Clase