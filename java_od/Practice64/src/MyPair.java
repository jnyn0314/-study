// 20220803 컴퓨터학과 정여진
public class MyPair<T> {
	private T first, second;
	public MyPair(T first, T second){
		this.first = first;
		this.second = second;
	}
	void setFirst(T first) {
		this.first = first;
	}
	public T getFirst() {
		return first;
	}
	void setSecond(T second) {
		this.second = second;
	}
	public T getSecond() {
		return second;
	}
	public String toString() {
		return ("만들어진 순서쌍:(" + first + ", " + second + ")"); 
	}
}
