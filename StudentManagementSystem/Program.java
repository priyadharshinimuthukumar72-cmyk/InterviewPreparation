package StudentManagementSystem;
import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("1 Add 2 Display 3 Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                int id = sc.nextInt();
                String name = sc.next();
                int marks = sc.nextInt();
                list.add(new Student(id, name, marks));
            } else if (choice == 2) {
                for (Student s : list) s.display();
            } else if (choice == 3) {
                break;
            }
        }
    }
}