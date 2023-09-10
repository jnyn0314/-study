// 20220803 컴퓨터학과 정여진
/*
public class Date {
	private int year;
	private int month;
	private int day;

	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	public void setYear(int year) {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDay(int day) {this.day = day;}

	// 생성자 중복정의
	
	public Date() {
		// 생성자 내부에서 매개변수가 3개인 1번 생성자 호출
		this(1900, 1, 1);
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day; // 왜?
	}
	public String toString() {
		String rslt = year + "년" + month + "월" + day + "일";
		return rslt;
	}
	public static int compareDate(Date x, Date y) {
		if(x.year > y.year)
			return -1;
		else if(x.year < y.year)
			return 1;
		
		if(x.month > y.month)
			return -1;
		else if(x.month < y.month)
			return 1;
		
		if(x.day > y.day)
			return -1;
		else if(x.day < y.day)
			return 1;
		
		return 0;
	}
}
*/
public class Date {
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		this.year = year; 
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toString() {
		String rslt = year + "년 " + month + "월 " + day;
		return rslt;
	}
	public static int compareDate(Date x, Date y) {
		if(x.year > y.year) {
			return 1;
		}
		else if(x.month > y.year) {
			return 1;
		}
		else if(x.day > y.day) {
			return 1;
		}
		else if(x.year == y.year && x.month == y.month && x.day == y.day)
			return 0;
		else
			return -1;
	}
}
