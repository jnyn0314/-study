// 20220803 컴퓨터학과 정여진
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Practice74 {

	private static Config getInput() {
		Scanner sc = new Scanner(System.in);
		Config c = new Config();
		
		System.out.println("원하는 난수의 개수를 입력하세요:");
		int size = sc.nextInt();
		c.setSize(size);
		
		System.out.println("난수값의 범위를 설정하세요:");
		int range = sc.nextInt();
		c.setRange(range);
		
		System.out.println("찾고 싶은 난수값을 입력하세요:");
		int key = sc.nextInt();
		c.setKey(key);
		if(key > range) {
			throw new ImproperKeyValueException();
		} // runtime예외랑 그냥 예외랑 뭐가 다른거지?
		sc.close();
		return c; // sc.close 랑 return 같이 쓰려면 먼저 닫고 return
	}
	private static ArrayList<Integer> getRandomNumbers(Config c){
		// Config 객체에 저장된 값에 해당하는 난수 리스트를 생성하여 반환
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for(int i = 0; i < c.getRange(); i++) {
			list1.add(i);
		}
		Collections.shuffle(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i < c.getSize(); i++) {
			list2.add(list1.get(i));
		}
		
		return list2;
	}
	private static void printArray(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if((i + 1) % 10 == 0)
				System.out.println();
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}
	private static boolean searchArray(ArrayList<Integer>list, Integer key) {
		return list.contains(key);
	}
	public static void main(String[] args) {
		
		// Config c = new Config();
		Config c = getInput();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		
		while(!searchArray(list, c.getKey())) {	
			list = getRandomNumbers(c);
			i++;
			System.out.print("(" + i + "차)");
			printArray(list);
		}
		System.out.println(i + "차 실행에서 난수" + c.getKey() + "이 발생했으므로 프로그램을 종료합니다.");
	}
}
