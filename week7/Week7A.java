import java.util.*;
import p1.Student;
import p2.VolleyBall;

// class Report {

//   void showVolleyBallPlayers() {
//     VolleyBall vb = new VolleyBall();
//     List players = vb.getPlayers();
//     System.out.println(
//       "Volley ball has " + vb.getMaxPlayers() + " per team : "
//     );
//     System.out.println("Players are:" + players);
//   }

//   void showStudents() {
//     List<Student> students = new ArrayList<Student>();
//     Student s1 = new Student("St1", 1);
//     s1.getClass().getName();
//     students.add(s1);
//     students.add(new Student("St2", 2));
//     students.add(new Student("St3", 3));
//     System.out.println("There are " + students.size() + " students, they are:");
//     System.out.println("Students are:" + students);
//   }
// }

class Week7A {

  public static void main(String[] args) {
    // Report r = new Report();
    // r.showVolleyBallPlayers();
    // r.showStudents();

    // int a[][] = { { 1, 2, 3, 4 }, { 2, 3 }, { 1, 2, 4 } };
    // int b[] = new int[10];

    String a = "hello welcome java";
    System.out.println(a.indexOf('e'));
    System.out.println(a.indexOf('a'));
    System.out.println(a.lastIndexOf('l'));
    System.out.println(a.lastIndexOf('a'));

    int i = 0;
    while (true) {
    }
  }
}

interface Q {
  void m1();
}
abstract class P implements Q {

  public void m1() {

  }
}
