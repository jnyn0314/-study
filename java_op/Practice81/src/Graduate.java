public class Graduate extends Student {
	private String lab;
	
	public Graduate() {
		super();
		this.lab = "";
	}
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	@Override
	public int calcScholarship() {
		if(getGpa() >= 3.5) {
			return getTuition() / 2;
		}
		else
			return getTuition() * 7/10;
	}
	public String toString() {
		return "학번:" + getId() + ",등록금" + getTuition() + ",평균등급:" + getGpa() + ",연구실:" + lab + ",장학금" + calcScholarship();
	}
}
