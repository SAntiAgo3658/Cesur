
public class ContadorInverso { //[1200...620] de 20 en 20 (while, do while y for)
	
	public static void main(String[] args) {
		
		int x = 1200;
		
		while (x >= 620) {
			 
			System.out.print(x + " ");
			x = x - 20;
		}
		
		x = 1200;
		System.out.println();
		
		do {
			
			System.out.print(x + " ");
			x = x - 20;
		
		} while (x >= 620);
		
		System.out.println();
		
		for (int i = 1200; i >= 620; i = i - 20) {
			
			System.out.print(i + " ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
