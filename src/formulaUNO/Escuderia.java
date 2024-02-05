package formulaUNO;

public class Escuderia {
	// ATRIBUTOS.

	// constantes de clase:
	private static final int NUMING = 4;
	private static final int NUMMEC = 6;
	private static final int NUMPIL = 2;
	private static final int NUMCOC = 2;

	// atributos de instancia
	public final String nombre;
	public JefeEscuderia jefe;
	public ArrayIngeniero ingenieros;
	public ArrayMecanico mecanicos;
	public ArrayPiloto pilotos;
	public ArrayCoche coches;

	// CONSTRUCTOR

	public Escuderia(String nombre) {

		this.nombre = nombre;
		this.jefe = null;
		this.coches = new ArrayCoche(NUMCOC);
		this.ingenieros = new ArrayIngeniero(NUMING);
		this.mecanicos = new ArrayMecanico(NUMMEC);
		this.pilotos = new ArrayPiloto(NUMPIL);

	}

	// GETTERS Y SETTTERS
	
	public void construirCoche(Coche coche) {
		coches.insertarValor(coche);
		
	}
	
	public void contratarIngeniero(Ingeniero ingeniero) {
		ingenieros.insertarValor(ingeniero);
		
	}
	
	public void contratarMecanico(Mecanico mecanico) {
		mecanicos.insertarValor(mecanico);
		
	}
	
	public void contratarPiloto(Piloto piloto) {
		pilotos.insertarValor(piloto);
		
	}
	
	public void destruirCoche(Coche coche) {
		
	}
	
	public void despedirIngeniero(Ingeniero ingeniero) {
		
	}
	
	public void despedirMecanico(Mecanico mecanico) {
		
	}
	
	public void despedirPiloto(Piloto piloto) {
		
	}
	
}
