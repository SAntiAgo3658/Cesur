package alumnoCesur;

class Clase {

	private int numAlumnos;
	private Alumno[] alumnos;
	private static int TOTALALUMNOS = 15;
	private String nombre;

	public Clase(String nombre) {
		alumnos = new Alumno[TOTALALUMNOS];
		numAlumnos = 0;
		this.nombre = nombre;

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
		return "[" + nombre + ", NumAlumnos: " + numAlumnos + "]";

	}

	public void delete(String nombreAlumno) {

		int i = 0;
		while ((i < numAlumnos) && !(alumnos[i].getNombre().equals(nombreAlumno))) {
			i++;

		}

		if (!(i == numAlumnos)) {

			for (int x = i; x < numAlumnos - 1; x++) {
				alumnos[x] = alumnos[x + 1];
			}

			alumnos[numAlumnos - 1] = null;

			numAlumnos--;

		}
	}

} // fin class Clase