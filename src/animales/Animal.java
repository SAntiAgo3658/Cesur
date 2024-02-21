package animales;

import java.io.Serializable;

public class Animal implements Serializable {

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

	public Animal(String nombre, int tmpvida) {

		this.nombre = nombre;

		if ((tmpvida < 1) || (tmpvida > 149)) {
			tmpvida = 0;

		}

		this.tmpvida = tmpvida;

	}

}
