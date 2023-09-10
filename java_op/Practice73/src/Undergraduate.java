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
	@Override
	public int calcScholarship() {
		if(getTuition() >= 3.5)
			return (int)(getTuition() * (getRate() + 0.2));
		else
			// return (int)(getTuition() * rate);
			return super.calcScholarship();
	}
	public String toString() {
		return "학번:" + getId() + ",등록금" + getTuition() + ",평균등급:" + getGpa() + ",학년:" + year + ",장학금" + calcScholarship();
	}
}

