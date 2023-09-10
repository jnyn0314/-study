// 20220803 컴퓨터학과 정여진
public class Practice72 {

	public static void main(String[] args) {
		
		Student s = new Student(1111, 100, 3.2);
		System.out.println(s.toString());
		
		Graduate g = new Graduate(2222, 100, 4.1, 3);
		System.out.println(g.toString());
		
		Undergraduate u = new Undergraduate(3333, 100, 3.4, "SE");
		System.out.println(u.toString());
	
	}
}
