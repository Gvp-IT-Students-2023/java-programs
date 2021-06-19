import java.util.*;

class Week8B {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    Scanner sc = new Scanner(System.in);
    int value;
    while (true) {
      System.out.println(
        " 1. Add \n 2. Get \n 3. Remove \n 4. Size \n 5. Display \n 6. Exit"
      );
      int op = sc.nextInt();
      switch (op) {
        case 1:
          System.out.println("Enter the value to be added: ");
          value = sc.nextInt();
          list.add(Integer.valueOf(value));
          break;
        case 2:
          System.out.println("Enter the index to get the object : ");
          int index = sc.nextInt();
          System.out.println("Object at" + index + " is " + list.get(index));
          break;
        case 3:
          System.out.println("Enter the value to remove : ");
          value = sc.nextInt();
          list.remove(Integer.valueOf(value));
          break;
        case 4:
          System.out.println("Size of arraylist is " + list.size());
          break;
        case 5:
          System.out.print("Arraylist is ");
          System.out.println(list.toString());
          break;
        case 6:
          System.exit(0);
          break;
      }
    }
  }
}
