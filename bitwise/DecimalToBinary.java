/**
 * DecimalToBinary
 */
public class DecimalToBinary {

  static String conversion(int n) {
    String bits = "";
    while (n != 0) {
      bits = (n & 1) + bits;
      n = n >> 1;
    }
    return bits;
  }
}