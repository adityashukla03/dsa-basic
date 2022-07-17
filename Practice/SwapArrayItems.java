public class SwapArrayItems {
  static void swap(int a[], int index1, int index2) {
    int temp = a[index1];
    a[index1] = a[index2];
    a[index2] = temp;
  }
  static int [] alternateSwap (int [] a) {
    for (int i = 0; i < a.length; i = i +2) {
      if (i + 1 < a.length) {
        int temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
      }
    }
    return a;
  }
}
