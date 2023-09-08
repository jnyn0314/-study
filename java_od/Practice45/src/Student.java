// 20220803 컴퓨터학과 정여진
public class Student {
	// 소속변수 id에 대한 설정자는 정의하지 말 것!
	// 등록금의 50% 지급
	private int id; // 학번
	private int tuition; // 등록금
	private double gpa; // 평균등급
	
	public Student(int id, int tuition, double gpa) {
		super();
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
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
	
	public int getId() {
		return id;
	}
	// setter 지움 -> 근데 왜 getter은 ?
	
	public String toString() {
		String rslt = "";
		
		rslt += "학번:" + id + ",등록금:" + tuition;
		rslt += ",평균등급:" + String.format("%.2f", gpa);
		rslt += ",장학금:" + scholarship();
		
		return rslt;
	}
	public int scholarship() { // 장학금은 등록금의 50%
		return  (int)(tuition * 0.5);
	}
}