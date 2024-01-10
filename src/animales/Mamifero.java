package animales;

public class Mamifero extends Animal {

	private boolean velloCorporal;

	public boolean isVelloCorporal() {
		return velloCorporal;
		
	}

	public void setVelloCorporal(boolean velloCorporal) {
		this.velloCorporal = velloCorporal;
		
	}

	public Mamifero(String nombre, int tmpvida, boolean velloCorporal) {
		super(nombre, tmpvida);
		this.velloCorporal = velloCorporal;
		
	}

}
