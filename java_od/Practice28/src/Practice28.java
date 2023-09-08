// 20220803 컴퓨터학과 정여진
public class Practice28 {

	public static void main(String[] args) {
		Person p1 = new Person("김동덕", 22, "서울시");
		System.out.println(p1.toString());
		
		Person p2 = new Person("홍길동", 30);
		p2.setAddress("제주시");
		System.out.println(p2.toString());
		
		Person p3 = new Person("성춘향");
		p3.setAge(16);
		p3.setAddress("남원시");
		System.out.println(p3.toString());
	}
}
