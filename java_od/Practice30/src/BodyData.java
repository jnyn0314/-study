// 20220803 컴퓨터학과 정여진
public class BodyData {
	private int weight;
	private int height;
	// 접근자와 설정자 추가
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int idealWeight() {
		return (height - 110);
	}// height보다 110 작은값을 반환
	public boolean needDiet() {
		if(weight > idealWeight()) {
			return true;
		}
		else {
			return false;
		}
	} // 현재의 weight가 이상적인 weight보다 크면 true, 아니면 false를 반환
	public boolean isTallerThan(BodyData b) {
		if(getHeight() >= b.height) {
			return true;
		}
		else {
			return false;
		}
	} //본 객체의 키가 매개변수 b의 키보다 크거나 같으면 true, 아니면 false를 반환
}
