import java.util.*;

class Figure_3D {

  int radius, height;

  Figure_3D(int radius) {
    this.radius = radius;
    this.height = 0;
  }

  Figure_3D(int radius, int height) {
    this.radius = radius;
    this.height = height;
  }

  double getSurfaceArea() {
    return 0.0;
  }

  double getVolume() {
    return 0.0;
  }
}

class Cone extends Figure_3D {

  Cone(int radius, int height) {
    super(radius, height);
  }

  @Override
  double getSurfaceArea() {
    return (
      Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height))
    );
  }

  @Override
  double getVolume() {
    return (Math.PI * radius * radius * height) / 3;
  }
}

class Cylinder extends Figure_3D {

  Cylinder(int radius, int height) {
    super(radius, height);
  }

  @Override
  double getSurfaceArea() {
    return 2 * Math.PI * radius * height;
  }

  @Override
  double getVolume() {
    return Math.PI * radius * radius * height;
  }
}

class Sphere extends Figure_3D {

  Sphere(int radius) {
    super(radius);
  }

  @Override
  double getSurfaceArea() {
    return 4 * Math.PI * radius * radius;
  }

  @Override
  double getVolume() {
    return (4 / 3) * Math.PI * radius * radius * radius;
  }
}

public class Week6B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no. of figures: ");
    int n = sc.nextInt();

    Figure_3D[] figs = new Figure_3D[n];

    int op, r, h;
    for (int i = 0; i < n; i++) {
      System.out.print("Enter 1 for Cylinder, any other - Sphere : ");
      op = sc.nextInt();
      if (op == 1) {
        System.out.print("Enter cylinder base radius : ");
        r = sc.nextInt();
        System.out.print("Enter cylinder height : ");
        h = sc.nextInt();
        figs[i] = new Cylinder(r, h);
      } else if (op == 2) {
        System.out.print("Enter Cone base radius : ");
        r = sc.nextInt();
        System.out.print("Enter Cone height : ");
        h = sc.nextInt();
        figs[i] = new Cone(r, h);
      } else {
        System.out.print("Enter sphere radius : ");
        r = sc.nextInt();
        figs[i] = new Sphere(r);
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print((i + 1) + " " + figs[i]);
      System.out.print(" area : " + ((float) figs[i].getSurfaceArea()));
      System.out.println(", volume : " + ((float) figs[i].getVolume()));
    }
  }
}
