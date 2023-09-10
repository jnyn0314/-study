package universe;

import planet.A; // 다른 package에 있는 class를 가져다 쓸 땐 반드시 import문 필요

@SuppressWarnings("unused")
public class D extends A {
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		// System.out.println(def); // 오류남 접근지정자가 없으니까(default)
		// System.out.println(prv);
		
		A aobj = new A(); // 객체를 사용할 수 없어서 안썼다고 오류남 -> suppressed를 통해 오류 없애기
		// System.out.println(aobj.pro); // 왜? protected붙은 변수를 객체를 통해 사용할 수 없다 자기가 상속한 걸로는 쓸 수 있다.
		
		// F fobj = new F(); // package가 다르니까 객체 생성 불가
		// fobj.accessTest(); 
	}
}

