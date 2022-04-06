package lab02;

public class CrocodileDentist {
   
   private int teeth;
   
   private final int soreTooth;
   
   private final int indexOfTheSoreTooth;
   
   public CrocodileDentist(int indexOfTheSoreTooth) {
      this.indexOfTheSoreTooth = indexOfTheSoreTooth;
      this.soreTooth = 0x1 << indexOfTheSoreTooth;
      this.teeth = 0xFFFFFFFF;
   }
   
   public void setTeeth(int teeth) {
      this.teeth = teeth;
   }

   public int getTeeth() {
      return teeth;
   }

   public int getSoreTooth() {
      return soreTooth;
   }

   public int getIndexOfTheSoreTooth() {
      return indexOfTheSoreTooth;
   }
   
   public boolean isSoreTooth(int index) {
      return index == indexOfTheSoreTooth;
   }
   
   public boolean hasTeeth() {
      return (teeth & ~soreTooth) != 0;
   }
   
   public void chooseTooth(int index) {
      int mask = ~(0x1 << index);
      teeth &= mask;
   }
}