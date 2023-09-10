// 20220803 컴퓨터학과 정여진
public class Undergraduate extends Student {

	private int year;
	public Undergraduate() {
		super();
		this.year = 0;
	}
	public Undergraduate(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int calcScholarship() {
		return (int)(getGpa() * 0.4);
	}
	public String toString() {
		return "학번:" + getId() + ",등록금" + getTuition() + ",평균등급:" + String.format(".2f", getGpa()) + ",학년:" + year + ",장학금" + calcScholarship();
	}
}
