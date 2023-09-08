// 20220803 컴퓨터학과 정여진
abstract class Shape{
	private int x, y;
	
	protected Shape() {
		x = 0;
		y = 0;
	}
	protected Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x = x;
	}
	protected int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y = y;
	}
	
	// 접근 제어자를 public으로 유지할 필요가 없는 이유? => 자식클래스까지만 접근 가능하면 되니까?
	
	abstract double calcArea(); // 추상 메소드
	
	public String toString() {
		String rslt;
		rslt = "중심좌표 :(" + x + "," + y + ")";
	return rslt;
	}
}

