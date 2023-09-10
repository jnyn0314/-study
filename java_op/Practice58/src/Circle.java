class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		x = 0;
		y = 0;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	void draw() {
		double y = 3.141592;
		System.out.println(String.format("%.2f", y)); // 3.14 출력
	}
}
