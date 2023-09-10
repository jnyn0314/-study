package universe;

class F {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		// System.out.println(aobj.prv);
		// 오류 (private니까)
	}
}
