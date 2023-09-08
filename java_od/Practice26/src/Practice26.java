public class Practice26 {

	public static void main(String[] args) {
		
		Date d1 = new Date(2004);
		System.out.println(d1.testReapYears());
		
		Date d2 = new Date(1997);
		System.out.println(d2.testReapYears());
		
		Date d3 = new Date(1800);
		System.out.println(d3.testReapYears());
		
		Date d4 = new Date(2000);
		System.out.println(d4.testReapYears());
		
		
	} // 메인 메소드에서는 4개의 date 객체를 만들고
	// 객체별로 testReapYears() 메소드만을 호출하여 해당 결과를 출력합니다.
 }
