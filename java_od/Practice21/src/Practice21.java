import java.util.Scanner;
public class Practice21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이:");
		int length = sc.nextInt();
		
		int array[] = new int[length];
		System.out.print("숫자를 입력하세요:");
		
		for(int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		} // 애는 for-each 로 못 바꿈!
		
		printArray(array);
		
		System.out.print("\n찾고 싶은 숫자를 입력하세요:");
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
		
		int count = 1;
		for(int value : array) {
			if(value == key) {
				return count;
			}
			count++;
		}
		return -1;
	}
	public static void printArray(int[] array) {
		System.out.print("배열에 저장된 숫자:");
		
		for(int value : array) {
			System.out.print(value + " ");
		}
	}
}