import java.util.*;

class Employee {

  private int id;
  private String name;
  private float salary;

  Employee() {}

  void setId(int id) {
    this.id = id;
  }

  int getId() {
    return id;
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  void setSalary(float salary) {
    this.salary = salary;
  }

  float getSalary() {
    return salary;
  }
}

class Week8C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Employee> map = new HashMap<Integer, Employee>();
    while (true) {
      System.out.println("Enter a choice:");
      System.out.println("1. Add Employee");
      System.out.println("2. Search Employee");
      int op = sc.nextInt();
      switch (op) {
        case 1:
          // add
          System.out.print("Enter new employee id: ");
          int id = sc.nextInt();
          System.out.print("Enter new employee name: ");
          String name = sc.next();
          System.out.print("Enter new employee salary: ");
          float salary = sc.nextFloat();
          Employee newEmployee = new Employee();
          newEmployee.setId(id);
          newEmployee.setName(name);
          newEmployee.setSalary(salary);
          map.put(id, newEmployee);
          System.out.println("Employee added successfully ");
          break;
        case 2:
          // search
          System.out.print("Enter employee id to search : ");
          int idse = sc.nextInt();
          Employee emp = map.get(idse);
          if (emp == null) {
            System.out.println("Employee with id " + idse + " does not exist");
          } else {
            System.out.println(
              "Employee: \n name : " +
              emp.getName() +
              " \n salary : " +
              emp.getSalary()
            );
          }
          break;
        case 3:
          return;
        default:
          break;
      }
    }
  }
}
