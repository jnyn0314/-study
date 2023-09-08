// 20220803 컴퓨터학과 정여진
public class UndergraduateStudent extends Student{
	// 등록금의 30% 지급
	
	private int year;
	
	// 1 생성자
	public UndergraduateStudent(int id, int tuition, double gpa, int year){
		super(id, tuition, gpa);
		this.year = year;
	}
	
	// 2 접근자, 설정자
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// 3 toString 메소드 재정의
	public String toString() {
		return super.toString() + ", 학년:" + year;
	}

	// 4 scholarship 메소드 재정의
	public int scholarship() {
		return (int)(getTuition() *(0.3));
	}
}
