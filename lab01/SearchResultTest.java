package lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchResultTest {

   @Test 
   void test() {
      SearchResult searchResult = new SearchResult("test");
      assertNotEquals(searchResult.getKeyword(), "");
      assertEquals(searchResult.getKeyword(), "test");
   }
   
   @Test
   void foundTest() {
      SearchResult searchResult = new SearchResult("russia");
      assertTrue(searchResult.found("russia"));
      assertFalse(searchResult.found("Ukrainian"));
      
      assertTrue(searchResult.found("Russia"));
   }
   
   @Test
   void toStringTest() {
      SearchResult searchResult = new SearchResult("russia");
      
      searchResult.increaseCount();
      searchResult.increaseCount();
      
      assertEquals("russia", searchResult.getKeyword());
      assertEquals(2, searchResult.getCount());
      assertEquals("The word \"russia\" found 2 times", searchResult.toString());

      SearchResult searchResult0 = new SearchResult("the");
      
      searchResult0.increaseCount();
      
      assertEquals("the", searchResult0.getKeyword());
      assertEquals(1, searchResult0.getCount());
      assertEquals("The word \"the\" found 1 times", searchResult0.toString());

   }
   
   @Test
   void increaseCountTest() {
      SearchResult searchResult = new SearchResult("test");
      assertEquals(0, searchResult.getCount());
      searchResult.increaseCount();
      assertEquals(1, searchResult.getCount());
   }
}
