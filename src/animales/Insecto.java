package animales;

public class Insecto extends Animal {

	private boolean alas;
	private boolean antenas;
	private Enemigo enemigo;

	public boolean isAlas() {
		return alas;

	}

	public void setAlas(boolean alas) {
		this.alas = alas;

	}

	public boolean isAntenas() {
		return antenas;

	}

	public void setAntenas(boolean antenas) {
		this.antenas = antenas;

	}

	public Enemigo getEnemigo() {
		return enemigo;

	}

	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;

	}

	public Insecto(String nombre, int tmpvida, boolean alas, boolean antenas, String enemigo) {
		super(nombre, tmpvida);
		this.alas = alas;
		this.antenas = antenas;
		this.enemigo = new Enemigo(enemigo);

	}

	class Enemigo {

		private String nombre;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Enemigo(String nombre) {
			super();
			this.nombre = nombre;
		}

	}

}
