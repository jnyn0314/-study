// 20220803 컴퓨터학과 정여진
public abstract class Student {
	private int id;
	private int tuition;
	private double gpa;
	protected static double rate;
	
	public Student() {
		this.id = 0;
		this.tuition = 0;
		this.gpa = 0;
	}
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
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
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate; 
	}
	
	
	public abstract int calcScholarship();
	
	public String toString() {
		return "학번:" + id + ",등록금" + tuition + ",평균등급:" + gpa + ",장학금:" + calcScholarship();
	}
}