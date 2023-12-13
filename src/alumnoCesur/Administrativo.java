package alumnoCesur;

public class Administrativo extends Persona {

	// ATRIBUTOS
	private boolean idiomas;

	// Constructor 3 PARÁMETROS
	public Administrativo(String nombre, int edad, boolean idiomas) {
		super(nombre, edad);
		this.idiomas = idiomas;

	}

	// Constructor 1 PARÁMETRO (NOMBRE)
	public Administrativo(String nombre) {
		super(nombre, 0);
		this.idiomas = false;

	}

	// Getters y setters

	public boolean isIdiomas() {
		return idiomas;

	}

	public void setIdiomas(boolean idiomas) {
		this.idiomas = idiomas;

	}

	public String toString() {
		return "[Administrativo: " + super.getNombre() + ", Edad: " + super.getEdad() + "Idiomas: " + idiomas + "]";

	}

}