package topGun;

public class Avion {

	// Atributos.
	private final int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;
	private static int contador = 0;
	private int combustible;

	// Constructor.
	public Avion(String modAvion, int capAvion, Piloto piloto) {
		super();
		contador++;
		this.idAvion = contador;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
		combustible = 0;

	}

	// Getters y setters.
	public int getIdAvion() {
		return idAvion;

	}

	public static int getContador() {
		return contador;

	}

	public String getModAvion() {
		return modAvion;

	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;

	}

	public int getCapAvion() {
		return capAvion;

	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;

	}

	public Piloto getPiloto() {
		return piloto;

	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;

	}

	public int getCombustible() {
		return combustible;
		
	}
	
    public void consumirCombustible() {
		combustible = 0;
	}
	
	public void rellenarCombustible() {
		combustible = 100;
	}

	// Mostrar avión.
	public void mostrarAvion() {
		System.out.println(
				"Avion [idAvion = " + idAvion + ", modAvion = " + modAvion + ", capAvion = " + capAvion + ", ");
		piloto.mostrarPiloto();

	}
	
}
