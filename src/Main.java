import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        int choice;

        do {

            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Display Summary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    tracker.addStudent(name, marks);

                    System.out.println("Student Added!");

                    break;

                case 2:

                    tracker.displayStudents();

                    break;

                case 3:

                    tracker.displaySummary();

                    break;

                case 4:

                    System.out.println("Thank you!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

        sc.close();
    }
}