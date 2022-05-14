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

  void insertionSort() {
    for (int i = 1; i < a.length; i++) {
      int temp = a[i];
      int j = i - 1;

      while (j >= 0 && temp < a[j]) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = temp;
    }

    for (int i : a) {
      System.out.println(i);
    }
  }

  void selectionSort() {
    for (int i = 0; i < a.length -1; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[min] > a[j]) {
          min = j;
        }
      }
      int temp = a[min];
      a[min] = a[i];
      a[i] = temp;
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
      System.out.println("2- Bubble Sort");
      System.out.println("3- Insertion Sort");
      System.out.println("4- Selection Sort");
      int ch = sc.nextInt();

      switch (ch) {
        case 1:
          System.out.println("Exiting the program..");
          sc.close();
          System.exit(0);
          break;
        case 2:
          System.out.println();
          sort.bubbleSort();
          break;
        case 3:
          System.out.println();
          sort.insertionSort();
          break;
        case 4:
          System.out.println();
          sort.selectionSort();
          break;

        default:
          break;
      }
    }

  }
}
