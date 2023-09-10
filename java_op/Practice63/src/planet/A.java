package planet;

@SuppressWarnings("unused") // 되도록이면 쓰지 말 것  
public class A {
	public int pub = 1;
	protected int pro = 2;
	int def = 3;
	private int prv = 4; // 사용 안해서 WARNING이 뜬다. private으로 선언했는데 안쓰면 무용지물이니까
}
