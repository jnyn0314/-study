// 20220803 컴퓨터학과 정여진
@SuppressWarnings("serial")
public class InvalidInputException extends Exception{
	public InvalidInputException() {
		super("잘못된 입력입니다.");
	}
}
