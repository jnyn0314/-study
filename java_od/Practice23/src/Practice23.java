public class Practice23 {

	public static void main(String[] args) {
		int[][] s = {
				{1, 2, 3, 4},
				{0, 0, 0, 0},
				{0, 0, 0, 0}
		};
		
		intArray(s);
		
		int[] colsum = new int[4];
		int[] rowsum = new int[3];
		
		rowSum(s, rowsum);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(s[i][j] + "\t");
			}
			System.out.print(rowsum[i] + "\t");
			System.out.println();
		}
		
		colSum(s, colsum);
		
		for(int i = 0; i < 4; i++) {
			System.out.print(colsum[i]+ "\t");
		}
		
		int total = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				total += s[i][j];
			}
		}
		System.out.print(total);
	}
	public static void intArray(int[][] s) {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				s[i + 1][j] = (int) (s[0][j] * Math.pow(10, i + 1));
			}
		}
	}
	public static void colSum(int [][] s, int[] colsum) { 
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0;  i < 3; i++) {
				colsum[j] += s[i][j];
			}
		}
	}
	public static void rowSum(int[][] s, int[] rowsum) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
			rowsum[i] += s[i][j];  	
			}
		}
	}
}