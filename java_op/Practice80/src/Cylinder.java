// 20220803 컴퓨터학과 정여진
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		this(0);
	}
	public Cylinder(double radius) {
		this(0, 0);
	}
	public Cylinder(double radius, double height) {
		this(0, 0, radius, height);
	}
	public Cylinder(int x, int y, double radius, double height) {			
		super(x, y, radius); // Cylinder class에 직접 정의된 게 아니다 보니 밑에처럼 하면 오류난다! super 활용 잘하기...
		this.height = height; 
		// this.x = x;
		// this.y = y;
		// this.radius = radius;
		// this.height = height;
	} // 이렇게 생성자 여러개 있으면 가장 복잡한 생성자부터 작성한다.(반드시!!!!! 그래야 안 헷갈려)
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return height * getRadius() * getRadius() * 3.14;
	}
	public String toString() {
		return "중심좌표(x):" + getX() + "중심좌표(Y)" + getY() + "반지름:";
	}
}
