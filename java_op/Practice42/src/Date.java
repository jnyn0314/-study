// 20220803 컴퓨터학과 정여진

public class Date {
	int year;
	int month;
	int day;
	
	public String toString() {
		String rslt;
		rslt = year + "년" + month + "월" + day + "일";
		return rslt;
	}
	public void setYear(int y){
		year = y;
	}
	public void setMonth(int m){
		month = m;
	}
	public void setDay(int d){
		day = d;
	}
}
