package topGun;

public class Combate extends Avion {

	// Atributos.
	private boolean esFurtivo;

	// Constructor.
	public Combate(String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;

	}

	// Getters y setters.
	public boolean isEsFurtivo() {
		return esFurtivo;

	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;

	}

}
