package lab06;

public class MyString implements Comparable{
	
	private String word;
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}
	
	public MyString(String word) {
		this.word=word;
	}

	@Override
	public int compareTo(Object obj) {
		return getWord().compareTo(((MyString) obj).getWord());
	}
	
	public static MyString[] getArrayFrom(String[] words){
		MyString[] myStrings = new MyString[words.length];
		for (int i = 0;i<words.length;i++) {
			myStrings[i] = new MyString(words[i]);
		}
		return myStrings;
	}
}
