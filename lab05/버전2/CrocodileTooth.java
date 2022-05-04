package lab05;

public class CrocodileTooth {
	
	protected boolean pulled;

	public CrocodileTooth() {
		pulled = false;
	}
	
	public boolean isPulled() {
		return pulled;
	}
	
	public boolean isSoreTooth() {
		return false;
	}
	
	public void remove() {
		pulled = true;
	}
}
