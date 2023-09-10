// 20220803 컴퓨터학과 정여진
public class Undergraduate extends Student {
	private String lab;
	
	public Undergraduate() {
		this.lab = "";
	}
	public Undergraduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	public String toString() {
		return "학번:" + getId() + ",등록금" + getTuition() + ",평균등급:" + getGpa() + ",연구실:" + lab;
	}
}
