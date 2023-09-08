// 20220803 컴퓨터학과 정여진
public class GraduateStudent extends Student {
	// 학점이 3.5이상이면 등록금의 50% 지급, 아니면 등록금의 10%지급
	private String lab; // 연구실		
	
	public GraduateStudent(int id, int tuition, double gpa, String lab) {
		super(id, tuition,gpa);
		this.lab= lab;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	
	public String toString() {
		return super.toString() + ", 연구실:" + lab;
	}
	
	public int scholarship() {
		if(getGpa() >= 3.5) {
			return (int)(getTuition() * (0.5));
		}
		else
			return (int)(getTuition() * (0.1));
	}
}
