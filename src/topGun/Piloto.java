package topGun;

public class Piloto {

	// Atributos.
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	private static int contador = 0;

	// Constructor.
	public Piloto(String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		super();
		contador++;
		this.idPiloto = contador;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;

	}

	// Getters y setters.
	public int getIdPiloto() {
		return idPiloto;

	}
	
	public static int getContador() {
		return contador;
		
	}

	public String getNomPiloto() {
		return nomPiloto;

	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;

	}

	public int getHorasVueloPiloto() {
		return horasVueloPiloto;

	}

	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;

	}

	public String getRangoPiloto() {
		return rangoPiloto;

	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;

	}

	// Mostrar piloto.
	public void mostrarPiloto() {
		System.out.println("Piloto [idPiloto = " + idPiloto + ", nomPiloto = " + nomPiloto + ", horasVueloPiloto = "
				+ horasVueloPiloto + ", rangoPiloto = " + rangoPiloto + "]");

	}

}
