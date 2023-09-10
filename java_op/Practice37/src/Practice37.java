// 20220803 컴퓨터학과 정여진
public class Practice37 {

	public static void main(String[] args) {

		Plane info_1 = new Plane();
		info_1.id = 0;
		info_1.model = "모름";
		info_1.capacity = 0;
		
		Plane info_2 = new Plane();
		info_2.id = 1030615;
		info_2.model = "보잉 737";
		info_2.capacity = 75;
		
		Plane info_3 = new Plane();
		info_3.id = 2464737;
		info_3.model = "보잉 747";
		info_3.capacity = 150;
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: " + info_1.id + "편");
		System.out.println("모델: " + info_1.model);
		System.out.println("승객수: " + info_1.capacity + "명");
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: " + info_2.id + "편");
		System.out.println("모델: " + info_2.model);
		System.out.println("승객수: " + info_2.capacity + "명");
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: " + info_3.id + "편");
		System.out.println("모델: " + info_3.model);
		System.out.println("승객수: " + info_3.capacity + "명");	
	}

}
