package planet;

public class F {
	void accessTest() {
		A aobj = new A(); // 같은 PACKAGE안에 있으니까 객체 만들 수 있다. 
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		// System.out.println(aobj.prv); // error! 왜냐면 접근 지정자가 private
	}
}
