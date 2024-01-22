package topGun;

public class Entrenamiento extends Avion {

	// Atributos.
	private boolean tieneDobleMando;

	// Constructor.
	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;

	}

	// Getters y setters.
	public boolean isTieneDobleMando() {
		return tieneDobleMando;

	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;

	}

}
