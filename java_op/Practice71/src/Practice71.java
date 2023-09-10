// 20220803 컴퓨터학과 정여진
public class Practice71 {

	public static void main(String[] args) {
		
		Circle c = new Circle(10.0);
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.println("반지름:" + c.getRadius());
		System.out.println("단면적:" + c.getArea());
		
		Cylinder cy1 = new Cylinder(0.0, 0.0); 
		Cylinder cy2 = new Cylinder(5.0, 3.0);
		
		System.out.println("Cylinder 객체 1에 대한 정보입니다.");
		System.out.println("반지름:" + cy1.getRadius());
		System.out.println("단면적:" + cy1.getArea());
		System.out.println("높이:" + cy1.getHeight());
		System.out.println("부피:" + cy1.getVolume());
		
		System.out.println("Cylinder 객체 2에 대한 정보입니다.");
		System.out.println("반지름:" + cy2.getRadius());
		System.out.println("단면적:" + cy2.getArea());
		System.out.println("높이:" + cy2.getHeight());
		System.out.println("부피:" + cy2.getVolume());
	}
}
