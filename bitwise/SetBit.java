public class SetBit {
  static int countSetBits(int a, int b) {
    int count = 0;
    while (a != 0) {
      a = a & (a - 1);
      count++;
    }
    while (b != 0) {
      b = b & (b - 1);
      count++;
    }
    return count;
  }
}
