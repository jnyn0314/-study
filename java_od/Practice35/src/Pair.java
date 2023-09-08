// 20220803 컴퓨터학과 정여진
public class Pair { // 정수 순서쌍 표현
	private Integer x;
	private Integer y;
	
	// 생성자
	Pair(Integer x, Integer y){
		this.x = x;
		this.y = y;
	}
	// 접근자, 설정자
	public void setX(int x) {
		this.x = x;
	}
	public Integer getX() {
		return x;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getY() {
		return y;
	}
	
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
	public static Pair add(Pair a, Pair b) {
		int SumX = a.getX() + b.getX();
		int SumY = a.getY() + b.getY();
		
		Pair rslt = new Pair(SumX, SumY);
		
		return rslt;
		
	}
	public static Pair sub(Pair a, Pair b) {
		int SubX = a.getX() - b.getX();
		int SubY = a.getY() - b.getY();
		
		Pair rslt = new Pair(SubX, SubY);
		
		return rslt;
	}
	public static Pair mult(Pair a, Pair b) {
		int MultX = a.getX() * b.getX();
		int MultY = a.getY() * b.getY();
		
		Pair rslt = new Pair(MultX, MultY);
		
		return rslt;
	}
	public static Pair div(Pair a, Pair b) {
		int DivX = a.getX() / b. getX();
		int DivY = a.getY() / b.getY();
		
		Pair rslt = new Pair(DivX, DivY);
		
		return rslt;
	}
}
