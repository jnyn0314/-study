// 20220803 컴퓨터학과 정여진
public class Practice57 {
	public static void checkNegative(int number) throws MyException{
		if(number < 0) {
			throw new MyException("음수는 안됩니다.");
		}
		System.out.println("다행히 음수는 아니군요.");
	}
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);
		}
		catch(MyException ex){
			ex.printStackTrace();
		}
	}
}
