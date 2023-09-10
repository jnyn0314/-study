package universe;

public class C {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub); // A랑 같은 패키지 안에 들어가있을 뿐 자식패키지도 아니고 아무것도 아냐
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		// System.out.println(aobj.prv);
		// 당연, private이니까
		F fobj = new F();
		fobj.accessTest();
	}
}
