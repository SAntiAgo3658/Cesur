package formulaUNO;

import java.util.Random;

public class Neumaticos {

	private enum tipoDureza {
		Blando, Medio, Duro
	};

	// ATRIBUTOS

	private final int IDNEUMATICO;
	private final int MATERIAL;
	private tipoDureza dureza;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Neumaticos(int iDNEUMATICO, int mATERIAL, Ingeniero iNGENIERO) {
		super();
		Random aleatorio = new Random();
		this.IDNEUMATICO = iDNEUMATICO;
		this.MATERIAL = aleatorio.nextInt(10);
		this.INGENIERO = iNGENIERO;
		this.TRABAJOING = iNGENIERO.trabajo();
		this.dureza = null;

	}

	// GETTERS Y SETTERS

	public tipoDureza getDureza() {
		return dureza;

	}

	public void setDureza(String dureza) {

		switch (dureza) {
		case "blando":
			this.dureza = tipoDureza.Blando;
			break;

		case "medio":
			this.dureza = tipoDureza.Medio;
			break;

		case "duro":
			this.dureza = tipoDureza.Duro;
			break;

		default:
			System.out.println("Eres subnormal");

		}

	}

	public void setDureza(tipoDureza dureza) {
		this.dureza = dureza;

	}

	public int getIDNEUMATICO() {
		return IDNEUMATICO;

	}

	public int getMATERIAL() {
		return MATERIAL;

	}

	public Ingeniero getINGENIERO() {
		return INGENIERO;

	}

	public int getTRABAJOING() {
		return TRABAJOING;

	}

	// CALIDAD

	public int construido() {
		return ((TRABAJOING + MATERIAL) / 2);
	}

}
