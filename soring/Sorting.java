import java.util.Scanner;

public class Sorting {
  int[] a = {5,4,4,3,2,1};

  void bubbleSort() {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[j];
          a[j] = a[i];
          a[i] = temp;
        }
      }
    }
    for (int i : a) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Sorting sort = new Sorting();
    while (true) {
      System.out.println("Please enter your choice");
      System.out.println("1- Exit the program");
      System.out.println("2- Selection Sort");
      int ch = sc.nextInt();

      switch (ch) {
        case 1:
          System.out.println("Exiting the program..");
          sc.close();
          System.exit(0);
          break;
        case 2:
          sort.bubbleSort();
          break;

        default:
          break;
      }
    }

  }
}
