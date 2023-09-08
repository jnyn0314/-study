// 20220803 컴퓨터학과 정여진
public class Practice27 {

	public static void main(String[] args) {
		// 2개의 객체를 만들고 각각 toString, printWestern 메소드를 호출하여 해당 결과를 출력
		Date d1 = new Date(2010, 9, 2);
		System.out.println(d1.toString() + "\n" + d1.printWestern());
		
		Date d2 = new Date(1997, 4, 1);
		System.out.println(d2.toString() + "\n" + d2.printWestern());
	}
}
