package planet;

public class B extends A{
	public void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		// System.out.println(prv); // private이니 오류
		
		F fobj = new F(); // F랑 B같은 package이니까 객체 만드는데 무리 x 
		fobj.accessTest(); 
	}
}
