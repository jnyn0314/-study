// 20220803 컴퓨터학과 정여진
public class Date {
	private int year;
	private int month;
	private int day;
	
	public String toString() {
		String rslt = year + "년" + month + "월" + day + "일";
		return rslt;
	}
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	public void setYear(int year) {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDay(int day) {this.day = day;}
	
}
