public class Practice06 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
				for(int j = 2; j <= 5; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
				}
				System.out.println();	
		}
		System.out.println("");
			
		for(int k = 1; k <= 5; k++) {
			for(int j = 6; j <= 9; j++) {
				System.out.print(j + " * " + k + " = " + (k * j) + "\t");
				}
				System.out.println();	
		}
	}
}
