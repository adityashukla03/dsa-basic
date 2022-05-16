import java.util.Scanner;

class LinkedList {
  Node head;

  void displayLinkedList() {
    if (head == null) {
      System.out.println("Linked List is empty\n");
      return;
    }
    System.out.println(head.data);
    System.out.println("**********Displaying Linked List***********");
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.data + ", ");
      currentNode = currentNode.next;
    }
    System.out.println("\n**********End***********");
  }

  void insertAtFirst(int data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
      System.out.println("Element added successfully at head.");
    } else {
      Node currentHead = head;
      head = node;
      head.next = currentHead;
      System.out.println("Element added successfully at head.");
    }
  }

  void removeNode(int data) {
    if (head == null) {
      System.out.println("Nothing to delete");
      return;
    }

    if (head.data == data) {
      head = head.next;
      System.out.println(data + " is deleted successfully");
      return;
    }

    Node currentNode = head;
    Node previousNode = null;

    while (currentNode != null && currentNode.data != data) {
      previousNode = currentNode;
      currentNode = currentNode.next;
    }
    if (currentNode != null) {
      previousNode.next = currentNode.next;
      System.out.println(data + " is deleted successfully");
      displayLinkedList();

    } else {
      System.out.println(data + " is not found in the list");
    }
  }

  int findMiddleElement(LinkedList list) {
    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }
    int key = -1;
    Node currentNode = head;
    int length = list.length();
    if (length == 1) {
      key = currentNode.data;
      return key;
    }
    for (int i = 0; i <= length/2; i++) {
      key = currentNode.data;
      currentNode = currentNode.next;
    }
    return key;
  }

  int findMiddleElementFaster() {
    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }
    if (head.next == null) {
      return head.data;
    }
    Node slowPointer = head;
    Node fastPointer = head;
    while (fastPointer != null && fastPointer.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }
    return slowPointer.data;
  }

  int length() {
    int counter = 0;
    if (head == null) {
      return counter;
    }
    Node currentNode = head;
    while (currentNode != null) {
      counter++;
      currentNode = currentNode.next;
    }
    return counter;
  }

  int getLengthRecursively(Node head) {
    if (head == null) {
      return 0;
    }
    return 1 + getLengthRecursively(head.next);
  }

  void deleteLinkedList() {
    head = null;
    System.out.println("Linked List deleted successfully");
  }

  void reversedLinkList() {
    if (head == null) {
      System.out.println("List is empty\n");
      return;
    }
    Node current = head;
    Node previous = null;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
    displayLinkedList();
  }

  public static void main(String ar[]) {
    LinkedList list = new LinkedList();
    while (true) {
      System.out.println("Please enter the choice");
      System.out.println("1- Display Linked List");
      System.out.println("2- Insert element at first");
      System.out.println("3- Delete element");
      System.out.println("4- Length of linked list");
      System.out.println("5- Delete linked list");
      System.out.println("6- Find the middle element");
      System.out.println("7- Find the middle element faster");
      System.out.println("8- Reverse the link list");
      System.out.println("9- Exit the program\n");

      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          list.displayLinkedList();
          break;
        case 2:
          System.out.println("Please enter the element to insert: ");
          int data = sc.nextInt();
          list.insertAtFirst(data);
          break;
        case 3:
          System.out.println("Please enter the element to delete: ");
          data = sc.nextInt();
          list.removeNode(data);
          list.displayLinkedList();
          break;
        case 4:
          System.out.println("Length of linked list: " + list.length() + "\n");
          break;
        case 5:
          list.deleteLinkedList();
          break;
        case 6:
          int middleElement = list.findMiddleElement(list);
          if (middleElement > -1) {
            System.out.println(middleElement + " is the middle element");
          }
          break;
        case 7:
          middleElement = list.findMiddleElementFaster();
          if (middleElement > -1) {
            System.out.println(middleElement + " is the middle element");
          }
          break;
        case 8:
          list.reversedLinkList();
          break;
        case 9:
          System.out.println("Exiting the program....");
          sc.close();
          System.exit(0);
          break;

        default:
        System.out.println("Please enter a correct choice");
          break;
      }
    }
  }
}
