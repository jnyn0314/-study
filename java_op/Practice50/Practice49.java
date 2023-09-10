// 20220803 컴퓨터학과 정여진

public class Practice49 {

	public static void main(String[] args) {
		System.out.println("디폴트 비행기의 정보입니다.");
		Plane defaultPlane = new Plane();
		System.out.print(defaultPlane.toString());
		
		System.out.println("제주행 비행기의 정보입니다.");
		Plane Jeju = new Plane();
		Jeju.setId(1030615);
		Jeju.setModel("보잉 737");
		Jeju.setCapacity(75);
		System.out.print(Jeju.toString());
		
		System.out.println("서울행 비행기의 정보입니다.");
		Plane Seoul = new Plane(2464737, "보잉 747", 150);
		System.out.print(Seoul.toString()); 
	}
}
