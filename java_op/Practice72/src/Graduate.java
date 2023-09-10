// 20220803 컴퓨터학과 정여진
public class Graduate extends Student {
	private int year;
	public Graduate() {
		super();
		this.year = 0;
	}
	public Graduate(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
	public String toString() {
		return "학번:" + getId() + ",등록금" + getTuition() + ",평균등급:" + getGpa() + ",학년:" + year;
	}
}
