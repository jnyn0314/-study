// 20220803 컴퓨터학과 정여진
public class Practice70 {

	public static void main(String[] args) {
		
		// Material b = new Material(); // 매개변수 없는 생성자가 없으니까 오류난다
		
		MaterialBox b1 = new MaterialBox(2, 3, 4, "wood"); 
		MaterialBox b2 = new MaterialBox(10, 5, 5, "paper");
		
		System.out.println("box1의 정보입니다.");
		b1.printInfo();
		System.out.println("box2의 정보입니다.");
		b2.printInfo();
	}
}
