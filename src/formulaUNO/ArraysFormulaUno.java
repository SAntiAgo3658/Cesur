package formulaUNO;

class ArrayCoche {
	// atributos
	private Coche[] coches;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	ArrayCoche(int longitud) {
		numElem = 0;
		coches = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			coches[i] = null;

		}

	}

	ArrayCoche() {
		numElem = 0;
		coches = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < coches.length; i = i + 1) {
			coches[i] = null;

		}

	}

	// metodos
	public int getNumElem() {
		return numElem;

	}

	public Coche[] getMiArray() {
		return coches;

	}

	public Coche getIntMiArray(int posicion) {
		if ((posicion < coches.length) && (posicion >= 0)) {
			return coches[posicion];

		} else {
			return null; // en caso de error al meter la posición

		}

	}

	public void resetear() {
		for (int i = 0; i < coches.length; i++) {
			coches[i] = null;
			numElem = 0;

		}

	}

	public void insertarValor(Coche valor) {
		if (numElem == coches.length) {
			System.out.println("Array lleno, no se ha insertado elemento");

		} else {
			coches[numElem] = valor;
			numElem++;

		}

	}

} // cierra MiArray

class ArrayPiloto {
	// atributos
	private Piloto[] pilotos;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	ArrayPiloto(int longitud) {
		numElem = 0;
		pilotos = new Piloto[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			pilotos[i] = null;

		}

	}

	ArrayPiloto() {
		numElem = 0;
		pilotos = new Piloto[lONGITUD_DEFAULT];
		for (int i = 0; i < pilotos.length; i = i + 1) {
			pilotos[i] = null;

		}

	}

	// metodos
	public int getNumElem() {
		return numElem;

	}

	public Piloto[] getMiArray() {
		return pilotos;

	}

	public Piloto getIntMiArray(int posicion) {
		if ((posicion < pilotos.length) && (posicion >= 0)) {
			return pilotos[posicion];

		} else {
			return null; // en caso de error al meter la posición

		}

	}

	public void resetear() {
		for (int i = 0; i < pilotos.length; i++) {
			pilotos[i] = null;
			numElem = 0;

		}

	}

	public void insertarValor(Piloto valor) {
		if (numElem == pilotos.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			pilotos[numElem] = valor;
			numElem++;

		}

	}

} // cierra MiArray

class ArrayIngeniero {
	// atributos
	private Ingeniero[] ingenieros;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	ArrayIngeniero(int longitud) {
		numElem = 0;
		ingenieros = new Ingeniero[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			ingenieros[i] = null;

		}

	}

	ArrayIngeniero() {
		numElem = 0;
		ingenieros = new Ingeniero[lONGITUD_DEFAULT];
		for (int i = 0; i < ingenieros.length; i = i + 1) {
			ingenieros[i] = null;

		}

	}

	// metodos
	public int getNumElem() {
		return numElem;

	}

	public Ingeniero[] getMiArray() {
		return ingenieros;

	}

	public Ingeniero getIntMiArray(int posicion) {
		if ((posicion < ingenieros.length) && (posicion >= 0)) {
			return ingenieros[posicion];

		} else {
			return null; // en caso de error al meter la posición

		}

	}

	public void resetear() {
		for (int i = 0; i < ingenieros.length; i++) {
			ingenieros[i] = null;
			numElem = 0;

		}

	}

	public void insertarValor(Ingeniero valor) {
		if (numElem == ingenieros.length) {
			System.out.println("Array lleno, no se ha insertado elemento");

		} else {
			ingenieros[numElem] = valor;
			numElem++;

		}

	}

} // cierra MiArray

class ArrayMecanico {
	// atributos
	private Mecanico[] mecanicos;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	ArrayMecanico(int longitud) {
		numElem = 0;
		mecanicos = new Mecanico[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			mecanicos[i] = null;
		}

	}

	ArrayMecanico() {
		numElem = 0;
		mecanicos = new Mecanico[lONGITUD_DEFAULT];
		for (int i = 0; i < mecanicos.length; i = i + 1) {
			mecanicos[i] = null;

		}

	}

	// metodos
	public int getNumElem() {
		return numElem;

	}

	public Mecanico[] getMiArray() {
		return mecanicos;

	}

	public Mecanico getIntMiArray(int posicion) {
		if ((posicion < mecanicos.length) && (posicion >= 0)) {
			return mecanicos[posicion];

		} else {
			return null; // en caso de error al meter la posición

		}

	}

	public void resetear() {
		for (int i = 0; i < mecanicos.length; i++) {
			mecanicos[i] = null;
			numElem = 0;

		}

	}

	public void insertarValor(Mecanico valor) {
		if (numElem == mecanicos.length) {
			System.out.println("Array lleno, no se ha insertado elemento");

		} else {
			mecanicos[numElem] = valor;
			numElem++;

		}

	}

} // cierra MiArray
