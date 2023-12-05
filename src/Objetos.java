
public class Objetos {

	public static void main(String[] args) {

		String[] cadenaInicial = new String[10];

		for (int i = 0; i < 10; i++) {
			cadenaInicial[i] = "hola";

		}

		ListaFijaCadenas cadena1 = new ListaFijaCadenas(3, cadenaInicial);
		for (int i = 0; i < cadena1.getNumElementos(); i++) {
			System.out.println(cadena1.getLista()[i]);

		}

	}

}

class ListaFijaCadenas {

	private int numElementos;
	private String[] lista = new String[MAXNUM];
	private static final int MAXNUM = 10;

	public int getNumElementos() {
		return numElementos;

	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;

	}

	public String[] getLista() {
		return lista;

	}

	public void setLista(String[] lista) {
		this.lista = lista;

	}

	public int getMAXNUM() {
		return MAXNUM;

	}

	public ListaFijaCadenas(int numElementos, String[] lista) {
		this.numElementos = numElementos;
		this.lista = lista;

	}
	
	public void introduceString(String cadena) {
		
		if(numElementos < 10) {
			
		}
	}

}
