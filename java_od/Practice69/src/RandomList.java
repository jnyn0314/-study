// 20220803 컴퓨터학과 정여진
import java.util.ArrayList;
public class RandomList<T> {
	private ArrayList<T> list;
	
	public RandomList() {
		list = new ArrayList<T>(); 
	}
	public void add(T item) {
		list.add(item);
	}
	public T selectLast() {
		return list.get(list.size() - 1);
	}
	public void print() {
		for(int i = 0; i < list.size(); i++)
		System.out.println(list.get(i));
	}
}
