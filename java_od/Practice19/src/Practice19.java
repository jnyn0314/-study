import java.util.Scanner;
public class Practice19 {

	public static void main(String[] args) {
		
		int[] array1 = new int[3];
		int[] array2 = new int[3];
		int all_same = 0;
		int num_same = 0;
		
		
		System.out.print("첫번째 배열 입력:");
		printArray(array1);
		
		System.out.print("두번째 배열 입력:");
		printArray(array2);
		
		System.out.println("자리와 값이 모두 같은 숫자:" + searchAll(array1, array2, all_same) + "개");
		System.out.println("자리는 다르고 값만 같은 숫자:" + searchNum(array1, array2, num_same) + "개");
	}
	public static int searchAll(int[] array1, int[] array2, int all_same) {
		
		all_same = 0;
		
		for(int i = 0; i < 3; i++) {
				if(array1[i] == array2[i]) {
					all_same++;
				}
		}
		
		return all_same;
	}
	public static int searchNum(int[] array1, int[] array2, int num_same) {
		
		num_same = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(array1[i] == array2[j]) {
					if(i != j) {
						num_same++;
					}
				}
			}
		}
		
		return num_same++;
	}
	
	public static void printArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
		}
	}
}
