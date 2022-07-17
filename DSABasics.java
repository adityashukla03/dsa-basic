/**
 * DSABasics
 */
public class DSABasics {

  public static void main(String[] args) {
    int[] array = {5, 2, 9, 4, 7, 6, 1, 0};
    // System.out.println(DecimalToBinary.conversion(2));
    // NoteCount.noteCounts(1360);
    // System.out.println(SetBit.countSetBits(2, 3));
    // System.out.println(Fibonacci.nthFibonacciTerm(5));
    // NoteCount.noteCounts(1360);
    // System.out.println(SetBit.countSetBits(2, 3));
    // System.out.println(Fibonacci.nthFibonacciTerm(5));
    int[] swappedArray = SwapArrayItems.alternateSwap(array);
    for (int i = 0; i < swappedArray.length; i++) {
      System.out.printf("%s, ", swappedArray[i]);
    }
  }
}