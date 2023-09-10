package universe;

import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		// System.out.println(aobj.pro); // 다른 package의 일반 class는 public만 참조가능
		// System.out.println(aobj.def);
		// System.out.println(aobj.prv);
		
		// F fobj = new F(); // package가 다르니까
		// fobj.accessTest();
	}
}
