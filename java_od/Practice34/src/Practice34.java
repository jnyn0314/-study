// 20220803 컴퓨터학과 정여진
public class Practice34 {

	public static void main(String[] args) {
		// 6개의 Date 객체를 형성합니다
		Date d1 = new Date(2007, 2, 18);
		System.out.println("오늘은 " + d1.toString() + "입니다.");
		
		Date d2 = new Date(2006, 3, 2);
		System.out.println("내가 동덕여자대학교에 입학한 날짜는 " + d2.toString() + "입니다.");
		
		Date d3 = new Date(2007, 2, 27);
		System.out.print("2007학년도 개강일은 " + d3.toString() + "에서 ");
		
		Date d4 = new Date(2007, 3, 2);
		System.out.println(d4.toString() + "로 변경되었습니다.");
		
		Date d5 = new Date(2007, 4, 20);
		System.out.print("중간고사 기간은 " + d5.toString());
		
		Date d6 = new Date(2007, 4, 26);
		System.out.println("부터 " + d6.toString() + "까지 입니다.");
		// 메인 메소드에서 사용하는 생성자는 실행결과에 표시된 대로 호출해야 합니다.
		// 실행결과에서 밑줄로 표시된 부분은 date 클래스의 toString 메소드를 호출하여 출력합니다.	
	} 
}