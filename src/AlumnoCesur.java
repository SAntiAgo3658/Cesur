
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
		System.out.println(premiumPlus);
		
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
		System.out.println(premiumPlus.getAlumnos()[i]); 
		
		}
	}

}

class Alumno {

	private String nombre;
	private int edad;
	private String curso;

	public Alumno(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;

	}

	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public int getEdad() {
		return edad;

	}

	public void setEdad(int edad) {
		this.edad = edad;

	}

	public String getCurso() {
		return curso;

	}

	public void setCurso(String curso) {
		this.curso = curso;

	}

	public String toString() {
		return "[Alumno: " + nombre + ", Edad: " + edad + ", curso: " + curso + "]";

	}

} // fin clase Alumno

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

} // fin clase Clase