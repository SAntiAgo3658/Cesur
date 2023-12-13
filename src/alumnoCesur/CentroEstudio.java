package alumnoCesur;

public class CentroEstudio {

	// ATRIBUTOS
	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;
	private int MAXCLASES;
	private int MAXADMIN;

	// CONSTRUCTOR(NOMBRE, CLASES, ADMINS)
	public CentroEstudio(String nombre, int mAXCLASES, int mAXADMIN) {
		this.nombre = nombre;
		MAXCLASES = mAXCLASES;
		MAXADMIN = mAXADMIN;
		this.administrativos = new Administrativo[MAXADMIN];
		this.clases = new Clase[MAXCLASES];

	}

	// CONSTRUCTOR(NOMBRE)
	public CentroEstudio(String nombre) {
		this.nombre = nombre;
		MAXCLASES = 10;
		MAXADMIN = 10;
		this.administrativos = new Administrativo[MAXADMIN];
		this.clases = new Clase[MAXCLASES];

	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public Administrativo[] getAdministrativos() {
		return administrativos;

	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;

	}

	public Clase[] getClases() {
		return clases;

	}

	public void setClases(Clase[] clases) {
		this.clases = clases;

	}

	public int getMAXCLASES() {
		return MAXCLASES;

	}

	public int getMAXADMIN() {
		return MAXADMIN;

	}
	
	public String toString() {
		return("[Centro: " + nombre + ", CAPACIDAD {Clases: " + MAXCLASES + ", NumAdmin: " + MAXADMIN + "}]");
		
	}

}
