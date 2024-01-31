package formulaUNO;

import java.util.Random;

public class Turbo {

	// ATRIBUTOS

	private final int IDTURBO;
	private final int RPM;
	private final int TAMAÑO;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	public Turbo(int iDTURBO, Ingeniero iNGENIERO) {
		super();
		Random aleatorio = new Random();
		this.IDTURBO = iDTURBO;
		this.RPM = aleatorio.nextInt(10);
		this.TAMAÑO = aleatorio.nextInt(10);
		this.INGENIERO = iNGENIERO;
		this.TRABAJOING = iNGENIERO.trabajo();

	}
	
	// GETTERS Y SETTERS

	public int getIDTURBO() {
		return IDTURBO;

	}

	public int getRPM() {
		return RPM;

	}

	public int getTAMAÑO() {
		return TAMAÑO;

	}

	public Ingeniero getINGENIERO() {
		return INGENIERO;

	}

	public int getTRABAJOING() {
		return TRABAJOING;

	}
	
	// CALIDAD
	
	public int construido() {
		return ((RPM + TAMAÑO + TRABAJOING) / 3);
		
	}

}
