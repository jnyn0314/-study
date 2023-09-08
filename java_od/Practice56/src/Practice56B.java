import java.util.Scanner;

// 20220803 컴퓨터학과 정여진
public class Practice56B {

	public static void main(String[] args) {
		int[] iArray = getInput();
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i * 20;
		}
		
		for(int x : iArray) {
			System.out.println(x + "\t");
		}
	}

public static int[] getInput(){
	Scanner s = new Scanner(System.in);
	
	String str;
	int[] rslt = new int[0];
	try {
	System.out.println("배열의 크기를 입력하세요:");
	str = s.next();
	
	int num = Integer.parseInt(str);
	
	rslt = makeArray(num);
	}catch(NumberFormatException e) {
		System.out.println("잘못된 형식의 숫자입니다.");
	}catch(NegativeArraySizeException e) {
		System.out.println("배열의 크기가 음수입니다.");
	}
	s.close();
	
	return rslt;
}

public static int[] makeArray(int size) throws NegativeArraySizeException{
	int[] rslt = new int[0];
	rslt = new int[size];
	
	return rslt;
	}
}