// 20220803 컴퓨터학과 정여진
public class Student extends Person{
	private long sid; // 학번
	private String major; // 전공
	
	// 생성자
	Student(){
		super();
	} // Person 클래스의 1번 생성자 사용 // 명시적 호출 방식
	Student(String name){
		super(name);
	}
	Student(String name, long sid){
		super(name);
		this.sid = sid;
	}
	Student(String name, long sid, String major){
		super(name);
		this.sid = sid;
		this.major = major;
	}
	// sid, major에 대한 설정자와 접근자
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	// 소속 메소드
	public String toString() {
		return "이름: " + getName() + ", 나이: " + getAge() + "세, 주소: " + getAddress() + ", 학번: " + sid + ", 전공:" + major;
	}
	public String printSafely() {
		return "이름: " + getName() + ", 학번: " + sid + ", 전공: " + major;
	}
	public int isSenior(Student s) {
		if(sid < s.sid) {
			return -1;
		}
		else if(sid == s.sid) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public boolean equalsMajor(Student s) {
		if(major == s.major) {
			return true;
		}
		else {
			return false;
		}
	}
	
}