public class Fibonacci {
  static int nthFibonacciTerm(int n) {
    int a = 0;
    int b = 1;
    int c = 0;
    System.out.println(a + "\t" + b);
    for (int i = 2; i < n; i++) {
      c = a + b;
      System.out.println(c + "\t");
      a = b;
      b = c;
    }
    return c;
  }
}
