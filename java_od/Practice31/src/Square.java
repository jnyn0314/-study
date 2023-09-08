// 20220803 컴퓨터학과 정여진
public class Square {
	private int width;
	private int height;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	private int area() {
		return width * height;
	}
	public boolean isSmallerThan(Square s) {
		if(area() < s.area()) {
			return true;
		}
		return false;
	}  // 본 객체의 넓이가 s보다 작으면 true
}