package animales;

public class Insecto extends Animal {

	private boolean alas;
	private boolean antenas;
	private Enemigo[] enemigos;

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

	public Enemigo[] getEnemigos() {
		return enemigos;
		
	}

	public void setEnemigos(String enemigo) {
		int x = 0;
		
		while (enemigos[x] != null) {
			x++;
		}
		
		enemigos[x] = new Enemigo(enemigo);
		
	}

	public Insecto(String nombre, int tmpvida, boolean alas, boolean antenas) {
		super(nombre, tmpvida);
		this.alas = alas;
		this.antenas = antenas;
		enemigos = new Enemigo[5];

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
