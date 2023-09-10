// 20220803 컴퓨터학과 정여진
public class Graduate extends Student {
	private String lab;
	
	public Graduate() {
		this.lab = "";
	}
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	@Override
	public int calcScholarship() {
		return (int)(getTuition()* (getRate() + 0.1));
	}
	public String toString() {
		return "학번:" + getId() + ",등록금" + getTuition() + ",평균등급:" + getGpa() + ",연구실:" + lab + ",장학금" + calcScholarship();
	}
}
// 만약 calaScholarship에 % 비율 변수를 쓴다면
// 그걸 가져와서 바꿀 수도 있을듯 super.calcScholarship으로 쓰는 게 가능
// 아니면 따로 base변수 써서 그걸 써도 된다.