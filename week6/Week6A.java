class Cost {
  int cost;

  Cost(int cost) {
    this.cost = cost;
  }
}

class Brand extends Cost {

  String brand;

  Brand(String brand, int cost) {
    super(cost);
    this.brand = brand;
  }
}

class Vehicle extends Brand {

  String name;

  Vehicle(String name, String brand, int cost) {
    super(brand, cost);
    this.name = name;
  }

  void displayInfo() {
    System.out.println("Vehicle name  : " + name);
    System.out.println("Vehicle brand : " + brand);
    System.out.println("Vehicle cost  : " + cost);
  }
}

class Week6A {

  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("Nano car", "Tata", 100);
    v1.displayInfo();

    Vehicle v2 = new Vehicle("SUV", "Mahindra", 150);
    v2.displayInfo();
  }
}
