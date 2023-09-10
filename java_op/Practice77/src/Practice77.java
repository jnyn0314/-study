// 20220803 컴퓨터학과 정여진
public class Practice77 {

	public static void printInfo(Student sa, Student sb) {
		if(sa == sb) {
			System.out.println("같은 객체");
		}
		else if(sa.isTheSame(sb)) {
			System.out.println("다른 객체/같은 학번");
		}
		else
			System.out.println("다른 객체/다른 학번");
	}
	
	public static void main(String[] args) {
		
		Student p1 = new Student(20111234, "홍길동", "컴퓨터학");
		Student p2 = new Student(20121357, "성춘향", "국문학");
		Student p3 = new Student(20121357, "성춘향", "국문학");
		Student p4 = p1;
		
		System.out.println("객체 p1의 정보:");
		System.out.println(p1.toString());
		System.out.println("객체 p2의 정보:");
		System.out.println(p2.toString());
		System.out.println("객체 p3의 정보:");
		System.out.println(p3.toString());
		System.out.println("객체 p4의 정보:");
		System.out.println(p4.toString());
		
		printInfo(p1, p2);
		printInfo(p2, p2);
		printInfo(p2, p3);
		printInfo(p1, p4);
	}
}