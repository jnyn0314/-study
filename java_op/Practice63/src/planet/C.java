package planet;

public class C {
	void accessTest() { // public 있고 없고 무슨 차이?
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		// System.out.println(aobj.prv);
		
		F fobj = new F();
		fobj.accessTest();
	}
}
