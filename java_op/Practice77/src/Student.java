// 20220803 컴퓨터학과 정여진
public class Student {
	private int id;
	private int tuition;
	private double gpa;
	private String name;
	private String major;
	
	public Student() {
		this.id = 0;
		this.tuition = 0;
		this.gpa = 0;
	}
	public Student(int id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
	}
	public int getId() {
		return id;
	} // id에 대한 설정자 정의하지 말 것!
	
	public int getTuition() {
		return tuition;
	}
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa; 
	}
	protected static double rate = 0.3;
	public int calcScholarship() {
		return (int)(rate * tuition);
	}
	public String toString() {
		return id + "/" + name + "/" + major;
	}
	public boolean isTheSame(Student s) {
		if(this.id == s.id) {
			return true;
		}
		else {
			return false;
		}
	}
}
