public class NoteCount {

  static void noteCounts(int amount) {
    int note = 0;
    switch (1) {
      case 1:
        note = amount / 100;
        amount %= 100;
        System.out.println("100 notes required: " + note);
      case 2:
        note = amount / 50;
        amount %= 50;
        System.out.println("50 notes required: " + note);
      case 3:
        note = amount / 20;
        amount %= 20;
        System.out.println("20 notes required: " + note);
      case 4:

        note = amount / 10;
        amount %= 10;
        System.out.println("10 notes required: " + note);
    }
  }
 }