import java.util.Scanner;

// 20220803 컴퓨터학과 정여진
public class Practice56A {

	public static void main(String[] args) {
		int[] iArray = getInput();
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i * 20;
		}
		
		for(int x : iArray) {
			System.out.println(x + "\t");
		}
	} // NumberFormatException : 잘못된 형식의 숫자입니다.
	// NegativeArraySizeException : 배열의 크기가 음수입니다.
	
public static int[] getInput() {
	Scanner s = new Scanner(System.in);
	
	int[] rslt = new int[0];
	String str;
	int num = 0;
	
	try {
	System.out.println("배열의 크기를 입력하세요:");
	str = s.next();
	
	num = Integer.parseInt(str);

	}catch(NumberFormatException e) {
		System.out.println("잘못된 형식의 숫자입니다.");
	}
	
	rslt = makeArray(num); // 호출
	s.close();
	
	return rslt;
}
public static int[] makeArray(int size) {
	int[] rslt = new int[0];
	try {
	rslt = new int[size];
	}catch(NegativeArraySizeException e) {
		System.out.println("배열의 크기가 음수입니다.");
	}
	
	return rslt;
	}
}