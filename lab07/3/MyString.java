package lab07;

import java.util.List;
import java.util.ArrayList;

public class MyString implements Comparable {
   
   private String word;
   
   public void setWord(String word) {
      this.word = word;
   }
   
   public String getWord() {
      return word;
   }
   
   public MyString(String word) {
      this.word = word;
   }
   
   @Override
   public int compareTo(Object obj) {
      MyString another = (MyString) obj;
      if (getWord().toLowerCase().charAt(0) == another.getWord().toLowerCase().charAt(0)) {
         if (getWord().charAt(0) == another.getWord().charAt(0)) {
            return getWord().compareTo(another.getWord());
         } else {
            return getWord().charAt(0) - another.getWord().charAt(0);
         }
      } else {
         return getWord().toLowerCase().compareTo(another.getWord().toLowerCase());
      }
   }
   
   public static MyString[] getArrayFrom(String[] words) {
      MyString[] myStrings = new MyString[words.length];
      for (int i = 0; i < words.length; i++) {
         myStrings[i] = new MyString(words[i]);
      }
      return myStrings;
   }
   
   public static List<MyString> getListFrom(String[] words) {
      List<MyString> myStrings = new ArrayList<>(words.length);
      List<String> list=new ArrayList<>();
      for (int i = 0; i < words.length; i++) {
         if (!list.contains(words[i])) {
            list.add(words[i]);
            myStrings.add(new MyString(words[i]));
         }
      }
      return myStrings;
   }
}