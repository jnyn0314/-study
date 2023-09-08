// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice58 {

	public static int searchArray(int[] array, int key) throws NotFoundException{
		
			for(int i = 0; i < array.length; i++) {
				if(array[i] == key) {
					return i + 1;
				}
			}
			NotFoundException e = new NotFoundException();
			throw(e);
	} // 1번째 매개변수로 주어진 배열에 2번째 매개변수로 주어진 숫자가 존재하면 그 인덱스를 반환
	
	public static void main(String[] args) {
		int[] array = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10개의 숫자를 입력하세요");
	
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("배열에 저장된 숫자입니다.");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("숫자를 하나 입력하세요;");
		int key = sc.nextInt();
		try {
			searchArray(array, key);
			
			System.out.println("입력된 숫자" +key + " 는 인덱스" + searchArray(array, key) + "번에 존재합니다.");
			
		}catch(NotFoundException e) {
			System.out.println("입력된 숫자"  + key + " 는" + e.getMessage());
		}
		 sc.close();
	}

}
