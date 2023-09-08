import java.util.Scanner;
public class Practice18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 길이:");
		int length = sc.nextInt();
		
		int array[] = new int[length];
		System.out.println("숫자를 입력하세요:");
		for(int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		printArray(array);
		
		System.out.println("\n찾고 싶은 숫자를 입력하세요:");
		int key = sc.nextInt();
		
		if(searchArray(array, key) == -1) {
			System.out.println("입력한 숫자 " + key + "는 배열에 없습니다.");
		}
		else {
			System.out.println("입력한 숫자 " + key + "는 " + searchArray(array, key) + "번 자리에 있습니다.");
		}
		sc.close();
	}
	public static int searchArray(int[] array, int key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void printArray(int[] array) {
		System.out.print("배열에 저장된 숫자:");
		for(int i =0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
