// 20220803 컴퓨터학과 정여진
public class Date{
		private int year;
		private int month;
		private int day;
		
		public int getYear() {
			return year;
		}
		public void setYear(int y) {
			year = y;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int m) {
			month = m;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int d) {
			day = d;
		}
		
		public String toString() {
			String rslt = getYear() + "년 " + getMonth() + "일 " + getDay() + "일";
			
			return rslt;
		}
	}
