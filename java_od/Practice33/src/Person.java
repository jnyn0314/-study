// 20220803 컴퓨터학과 정여진
public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(){
		name = "모름";
		age = -1;
		address = "모름";
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		String rslt = "이름:" + name + ", 나이:" + age + "세, 주소:" + address;
		
		return rslt;
	}
}