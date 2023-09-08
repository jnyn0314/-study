// 20220803 컴퓨터학과 정여진
public class Person implements Speakable{
	@SuppressWarnings("unused") // 이거 안쓰고는 밑줄 못없애나?
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void speak() {
		if(age <= 2) {
			System.out.println("응애");
		}
		else {
			System.out.println("안녕");
		}
	}	
}
