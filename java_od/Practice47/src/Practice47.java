// 20220803 컴퓨터학과 정여진
public class Practice47 {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Person p1 = new Person("김동덕", 1);
		Person p2 = new Person("홍길동", 20);
		
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}
	private static void speak3Times(Dog myDog) {
		myDog.speak();
		myDog.speak();
		myDog.speak();
	}
	private static void speak3Times(Person p) {
		p.speak();
		p.speak();
		p.speak();
	}

}
// 생각해보기 : 지금 p.speak(), myDog.speak() 부분이 중복되는데
// 음... speakNTimes() 메소드를 만들어서 n번 speak할 때 n번 호출한다 이렇게 하면 되지 않을까