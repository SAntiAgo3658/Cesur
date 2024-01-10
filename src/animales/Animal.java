package animales;

public class Animal {

	private String nombre;
	private int tmpvida;

	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public int getTmpvida() {
		return tmpvida;

	}

	public void setTmpvida(int tmpvida) {
		this.tmpvida = tmpvida;

	}

	protected Animal(String nombre, int tmpvida) {

		this.nombre = nombre;

		if ((tmpvida < 1) || (tmpvida > 149)) {
			tmpvida = 0;

		}

		this.tmpvida = tmpvida;

	}

}
