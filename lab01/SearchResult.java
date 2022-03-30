package lab01;

public class SearchResult {
	
	private String keyword;
	
	private int count;

	public SearchResult(String keyword) {
		this.keyword=keyword.toLowerCase();
	}

	public String getKeyword() {
	    return keyword;
	}
	   
	   public int gerCount() {
		return count;
	}

	public boolean found(String word) {
		return keyword.equals(word.toLowerCase());
	}

	public void increaseCount() {
		count++;		
	}

	public String toString() {
	    return "The word \"" + keyword + "\" found " + count + " times";
	}

}
