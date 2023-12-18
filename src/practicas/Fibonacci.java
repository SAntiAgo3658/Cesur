package practicas;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int maxNum = 100;
		int numPrevio = 1;
		int numActual = 1;
		int contador = 0;
		int numTemp;
		System.out.print(numPrevio + " ");
		
		while (contador < maxNum) {
			contador++;
		    System.out.print(numActual + " ");
		    numTemp = numActual;
		    numActual = numActual + numPrevio;
		    numPrevio = numTemp;
		 
		}
		
	}

}
