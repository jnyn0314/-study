public class Practice22 {

	public static void main(String[] args) {
		int[][] s = {
				{1, 2, 3, 4},
				{10, 20, 30, 40},
				{100, 200, 300, 400}
		};
		
		intArray(s);
		int[] sum = new int[4];
		colSum(s, sum);
	}
	public static void intArray(int[][] s) {
		System.out.println("배열만 출력:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(s[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void colSum(int [][] s, int[] sum) { 
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i++) {
				sum[i] += s[j][i];  	
			}
		}
		System.out.println("합과 함께 출력:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(s[i][j] + "\t");
			}
			System.out.println();
		}
		for(int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + "\t");
		}
		
	}
}
