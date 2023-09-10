// 20220803 컴퓨터학과 정여진
public class Rectangle extends Shape{	
	private int width, height;
	public Rectangle() {
		super(); // 상위 클래스의 생성자 이용 : 명시적 호출
		this.width = 0;
		this.height = 0;
	}
	public Rectangle(int width, int height) {
		setX(0);
		setY(0); // 중심좌표는 모두 0으로 설정, x, y는 부모 class안에 있지만 private이니까 setter 쓴다.	
		this.width = width;
		this.height = height; // 가로길이, 세로길이는 매개변수로 전달받은 값으로 설정
	}
	public void printInfo() {
		System.out.println("사각형::중심좌표(" + width + height + ")::면적-" + area() + "::둘레-" + height);
	}
	public int area() {
		int area = width * height;
		return area;
	}
	public int perimeter() {
		int perimeter = (width + height) * 2;
		return perimeter;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	} // 설정자와 접근자
}
