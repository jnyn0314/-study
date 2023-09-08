// 20220803 컴퓨터학과 정여진
public class UndergraduateStudent extends Student{
	// 등록금의 30% 지급
	
	private int year;
	
	public UndergraduateStudent(int id, int tuition, double gpa, int year){
		super(id, tuition, gpa);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return super.toString() + ", 학년:" + year;
	}
	public int scholarship() {
		return (int)(getTuition() *(0.3));
	}
}