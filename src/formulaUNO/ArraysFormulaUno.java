package formulaUNO;

class ArrayCoche {
	// atributos
	private Coche[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	ArrayCoche(int longitud) {
		numElem = 0;
		miArray = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;

		}

	}

	ArrayCoche() {
		numElem = 0;
		miArray = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;

		}

	}

	// metodos
	public int getNumElem() {
		return numElem;

	}

	public Coche[] getMiArray() {
		return miArray;

	}

	public Coche getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];

		} else {
			return null; // en caso de error al meter la posición

		}

	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;

		}

	}

	public void insertarCoche(Coche valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");

		} else {
			miArray[numElem] = valor;
			numElem++;

		}

	}

	public void destruirCoche(Coche coche) {
		if (numElem > 0) { // Hay coches en el garaje
			boolean noEncontrado = true;
			int contador = 0;

			while ((noEncontrado) && (contador < numElem)) {

				if (miArray[contador] == coche) {
					noEncontrado = false;

				} else {
					contador++;

				}

			}

			if (contador == numElem) { // El coche no ha sido encontrado
				System.out.println("El coche " + coche.getModelo() + " no se encuentra en el garage");

			} else { // Hemos encontrado el coche, lo tengo que borrar
				numElem--;

				for (int x = contador; x < numElem; x++) {
					miArray[x] = miArray[x + 1];

				}

				miArray[numElem] = null;

			}

		} else { // Garaje vacío
			System.out.println("Garaje vacío, no se puede encontrar el coche");

		}

	}

} // cierra arrayCoche

class ArrayPiloto {
	// atributos
	private Piloto[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	ArrayPiloto(int longitud) {
		numElem = 0;
		miArray = new Piloto[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;

		}

	}

	ArrayPiloto() {
		numElem = 0;
		miArray = new Piloto[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;

		}

	}

	// metodos
	public int getNumElem() {
		return numElem;

	}

	public Piloto[] getMiArray() {
		return miArray;

	}

	public Piloto getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];

		} else {
			return null; // en caso de error al meter la posición

		}

	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;

		}

	}

	public void insertarValor(Piloto valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;

		}

	}

	public void destruirCoche(Piloto piloto) {
		if (numElem > 0) { // Hay coches en el garaje
			boolean noEncontrado = true;
			int contador = 0;

			while ((noEncontrado) && (contador < numElem)) {

				if (miArray[contador] == piloto) {
					noEncontrado = false;

				} else {
					contador++;

				}

			}

			if (contador == numElem) { // El coche no ha sido encontrado
				System.out.println("El coche " + piloto.getNombre() + " no se encuentra en el garage");

			} else { // Hemos encontrado el coche, lo tengo que borrar
				numElem--;

				for (int x = contador; x < numElem; x++) {
					miArray[x] = miArray[x + 1];

				}

				miArray[numElem] = null;

			}
		}

	} // cierra MiArray
}

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

	public void insertarIngeniero(Ingeniero valor) {
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

	public void insertarMecanico(Mecanico valor) {
		if (numElem == mecanicos.length) {
			System.out.println("Array lleno, no se ha insertado elemento");

		} else {
			mecanicos[numElem] = valor;
			numElem++;

		}

	}

}
// cierra MiArray
