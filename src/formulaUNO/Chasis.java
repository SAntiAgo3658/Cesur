package formulaUNO;

import java.util.Random;

public class Chasis {

	// ATRIBUTOS

	private final int IDCHASIS;
	private final int MATERIAL;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// CONSTRUCTOR

	public Chasis(int iDCHASIS, Ingeniero iNGENIERO, int tRABAJOING) {
		super();
		Random aleatorio = new Random();
		this.IDCHASIS = iDCHASIS;
		this.MATERIAL = aleatorio.nextInt(10);
		this.INGENIERO = iNGENIERO;
		this.TRABAJOING = iNGENIERO.trabajo();

	}

	// GETTERS Y SETTERS

	public int getIDCHASIS() {
		return IDCHASIS;

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
		return ((MATERIAL + TRABAJOING) / 2);

	}

}
