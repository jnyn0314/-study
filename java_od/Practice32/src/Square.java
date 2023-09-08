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
		else {
		return false;
		}
	}  
	public static Square getInstance(int width, int height) {
		Square s1 = new Square();
		
		s1.width = width;
		s1.height = height;
		
		return s1;
	} //이걸 생성자 대신 사용하여 메인 메소드를 작성, 
	// 1. 객체를 생성하고 2. 주어진 매개변수를 소속 변수에 저장하고 3. 만들어진 객체를 반환한다.
}