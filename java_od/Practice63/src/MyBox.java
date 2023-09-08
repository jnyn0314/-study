// 20220803 컴퓨터학과 정여진
public class MyBox<T> {
	private T s;
	public MyBox(T s) {
		this.s = s;
	}
	void set(T s) {
		this.s = s;
	}
	public T get() {
		return s;
	}
}
