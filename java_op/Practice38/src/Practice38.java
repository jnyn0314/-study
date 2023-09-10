// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person info_1 = new Person();
		info_1.name = "김동덕";
		info_1.address = "서울";
		
		Person info_2 = new Person();
		info_2.name = "홍길동";
		info_2.address = "경북";
		
		Person info_3 = new Person();
		info_3.name = "성춘향";
		info_3.address = "전남";
		
		System.out.print(info_1.name + " 나이는? ");
		info_1.age = sc.nextInt();
		System.out.print(info_2.name + " 나이는? ");
		info_2.age = sc.nextInt();
		System.out.print(info_3.name + " 나이는? ");
		info_3.age = sc.nextInt();
		
		String middle;
		
		if(info_1.age > info_2.age) 
		{
			if(info_2.age > info_3.age) {		
				middle = info_2.name;
			}
			else {
				if(info_1.age > info_3.age) {
				middle = info_3.name;
				}
				else {
					middle = info_1.name;
				}
			}
		}
		else { 
			if(info_1.age > info_3.age) {
			middle = info_1.name;
			}
			else {
				if(info_2.age > info_3.age) {
				middle = info_3.name;
				}
				else {
				middle = info_2.name;
				}
			}	
		}
		System.out.println("\n객체별 정보입니다.");
		System.out.println(info_1.name + " : " + info_1.age + "세," + info_1.address);
		System.out.println(info_2.name + " : " + info_2.age + "세," + info_2.address);
		System.out.println(info_3.name + " : " + info_3.age + "세," + info_3.address);
		System.out.println("\n나이가 중간인 사람은 " + middle + " 입니다.");
		
		sc.close();
	}

}
