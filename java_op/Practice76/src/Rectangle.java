// 20220803 컴퓨터학과 정여진
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	private int area() {
		return width * height;
	}
	public boolean isSmallerThan(Rectangle s) {
		if(this.area() < s.area()) {
			return true;
		}
		else
			return false;
	}	
}