package animales;

public class UsoAnimales {

	public static void main(String[] args) {

		Mamifero perro = new Mamifero("perro", 17, true);
		Insecto hormiga = new Insecto("hormiga", 2, false, true);
		System.out.println("El animal " + hormiga.getNombre() + " tiene alas? " + hormiga.isAlas());
		System.out.println(hormiga.getNombre() + " tiene de enemigo a : " + hormiga.getEnemigos().length);
		Insecto atomica = new Insecto(hormiga.getNombre() + " atómica", hormiga.getTmpvida(), hormiga.isAlas(),
				hormiga.isAntenas());
		hormiga.setAlas(true);
		Insecto volantona = hormiga;
		volantona.setNombre("volantona");
		System.out.println(hormiga.getNombre() + " tiene alas?: " + hormiga.isAlas());
		System.out.println(atomica.getNombre() + " tiene alas?: " + atomica.isAlas());
		System.out.println(volantona.getNombre() + " tiene alas?: " + volantona.isAlas());
		volantona.setNombre(atomica.getNombre());
		System.out.println(volantona.getNombre());
		

	}

}
