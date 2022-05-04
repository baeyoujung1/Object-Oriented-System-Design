package lab05;

public class CrocodileTooth {
	
	private boolean pulled;
	
	private boolean soreTooth;

	public CrocodileTooth(boolean soreTooth) {
		this.soreTooth = soreTooth;
		pulled = false;
	}
	
	public boolean isPulled() {
		return pulled;
	}
	
	public boolean isSoreTooth() {
		return soreTooth;
	}
	
	public void remove() {
		pulled = true;
	}
	
	public String toString() {
		// !!.... OUCH!!!, Zzzzz..., "JACKPOT!!!"
		if (soreTooth){
			return "!!!....OUCH!!!";
		}else {
			return "Zzzzz...";
		}
	}
}
