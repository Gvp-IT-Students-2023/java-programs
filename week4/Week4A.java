import java.util.Scanner;

class Box {

  int width, height, depth;

  Box(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  int getVolume() {
    return width * height * depth;
  }
}

class Week4A {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter width of box: ");
    int w = sc.nextInt();
    System.out.print("Enter height of box: ");
    int h = sc.nextInt();
    System.out.print("Enter depth of box: ");
    int d = sc.nextInt();
    Box box = new Box(w, h, d);
    System.out.println("Volume of box is " + box.getVolume() + " sq.units");
  }
}
