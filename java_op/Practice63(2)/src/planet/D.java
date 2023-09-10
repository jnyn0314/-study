package planet;

import universe.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		// System.out.println(def); // int def이니까 접근지정자가 없음(default). 이 경우 같은 package안에서만 접근가능
		// System.out.println(prv); // private이니까 불가능
		
		A aobj = new A();
		// System.out.println(aobj.pro); // 이건 왜 오류?
	}
}
