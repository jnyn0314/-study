// 20220803 컴퓨터학과 정여진
public class Rectangle {
	private int width;
	private int height;
	
	int area() {
		int ar = width * height;
		return ar;
	}
	
	int perimeter() {
		int peri = (width + height) * 2;
		return peri;
	}
	public int getWidth() {return width;}
	public void setWidth(int y) {width = y;}
	public int getHeight(){return height;}
	public void setHeight(int h) {height = h;}
}
