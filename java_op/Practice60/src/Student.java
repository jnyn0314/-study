// 20220803 컴퓨터학과 정여진

public class Student extends Person{
	private int year;

	void setYear(int year) {
		this.year = year;
		}
	int getYear(){
		return year;
		}
	
	public Student (String name, int year) {
		this.name = name;
		this.year = year;
	}
}