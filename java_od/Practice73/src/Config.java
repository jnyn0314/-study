public class Config {
	private int size, range, key;
	
	
	public Config() {
		size = 0;
		range = 0;
		key = 0;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getSize() {
		return size;
	}
	public int getRange() {
		return range;
	}
	public int getKey() {
		return key;
	}
}