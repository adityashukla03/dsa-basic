import java.util.Scanner;

public class Sorting {
  int[] a = {4, 6, 2, 5, 7, 9, 1, 3};

  void swap(int index1, int index2) {
    int temp = a[index1];
    a[index1] = a[index2];
    a[index2] = temp;
  }

  void displayArray() {
    for (int i : a) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  void bubbleSort() {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          swap(i, j);
        }
      }
    }
    displayArray();
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

    displayArray();
  }

  void selectionSort() {
    for (int i = 0; i < a.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[min] > a[j]) {
          min = j;
        }
      }
      swap(min, i);
    }
    displayArray();
  }

  int partition(int l, int h) {
    int pivot = a[(l + h) / 2];
    int i = l;
    int j = h;
    System.out.println(i +" "+ j);
    while (i < j) {
      while (a[i] <= pivot) {
        i++;
      }
      while (a[j] > pivot) {
        j--;
      }
      if (i < j) {
        swap(i, j);
      }
    }
    swap(i, j);
    return j;
  }

  void quickSort(int l, int h) {
    if (l < h) {
      int pivot = partition(l, h);
      quickSort(l, pivot - 1);
      quickSort(pivot + 1, h);
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
      System.out.println("5- Quick Sort");
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

        case 5:
          System.out.println();
          sort.quickSort(0, sort.a.length - 1);
          sort.displayArray();
          break;

        default:
          break;
      }
    }

  }
}
