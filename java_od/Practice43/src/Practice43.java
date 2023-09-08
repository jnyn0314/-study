// 20220803 컴퓨터학과 정여진
public class Practice43 {

	public static void main(String[] args) {
	// shape 타입의 배열 선언 : 크기 = 3
		Shape[] sArray = new Shape[3];
		
		sArray[0] = new Shape();
		sArray[1] = new Rectangle();
		sArray[2] = new Triangle();
		
		// instanceof 연산자 = 변수가 가리키는 객체의 실제 type을 알고 싶을 때 사용
		
		System.out.println(sArray[0] instanceof Shape); // true
		System.out.println(sArray[0] instanceof Rectangle); // false
		System.out.println(sArray[0] instanceof Triangle); // false
		
		System.out.println(sArray[1] instanceof Shape); // false라 생각했으나... true. 왜냐, Rectangle, Triangle이 다 shape 상속
		System.out.println(sArray[1] instanceof Rectangle); // true
		System.out.println(sArray[1] instanceof Triangle); // false
		
		System.out.println(sArray[2] instanceof Shape); // false라 생각했으나... true
		System.out.println(sArray[2] instanceof Rectangle); // false
		System.out.println(sArray[2] instanceof Triangle); // true
	}
}
