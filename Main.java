import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1. Add Student\n2. Show All Students\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Department: ");
                String dept = sc.nextLine();
                System.out.print("CGPA: ");
                double cgpa = sc.nextDouble();

                Student s = new Student(name, dept, cgpa);
                dao.addStudent(s);
                System.out.println("Student Added!");
            } else if (choice == 2) {
                List<Student> students = dao.getAllStudents();
                for (Student s : students) {
                    System.out.println(s.getId() + " | " + s.getName() + " | " + s.getDepartment() + " | " + s.getCgpa());
                }
            } else {
                break;
            }
        }sc.close();

    }
}
