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
		// height 보다 110 작은 값을 반환
		return height - 110;
	}
	public boolean isTallerThan(BodyData b) { // 매개변수로 받은 거 자체가 BodyData b = new BodyData(); 랑 같나?
		
		// 본 객체의 키가 매개변수 b의 키보다 크면 true 작으면 false반환
		if(height > b.getHeight())
			return true;
		else
			return false;
	}
	public boolean needDiet() {
		if(weight > idealWeight())
			return true;
		else
			return false;
	}
	
}
