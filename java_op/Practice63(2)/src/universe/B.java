package universe;

public class B extends A{
	public void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		// System.out.println(prv);
		
		F fobj = new F();
		fobj.accessTest(); // F랑 B가 같은 패키지니까
	}
}
