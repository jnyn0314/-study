package out;

import planet.*;
import universe.*;
@SuppressWarnings("unused")
public class T {
	public static void main(String[] args) {
		B bobj = new B(); // B 앞에는 public -> 호출 가능
		bobj.accessTest();
		
		// E eobj = new E(); // E 앞에는 default -> 호출 가능
		// eobj.accessTest();
		
		F fobj = new F(); // 만들어놓고 안써서 오류 -> suppressed 쓰기
	}
}
