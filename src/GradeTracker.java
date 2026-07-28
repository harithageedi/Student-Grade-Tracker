import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n------ Student Records ------");

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public double calculateAverage() {

        if (students.isEmpty())
            return 0;

        int total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        return (double) total / students.size();
    }

    public Student highestScore() {

        if (students.isEmpty())
            return null;

        Student highest = students.get(0);

        for (Student s : students) {

            if (s.getMarks() > highest.getMarks()) {
                highest = s;
            }

        }

        return highest;
    }

    public Student lowestScore() {

        if (students.isEmpty())
            return null;

        Student lowest = students.get(0);

        for (Student s : students) {

            if (s.getMarks() < lowest.getMarks()) {
                lowest = s;
            }

        }

        return lowest;
    }

    public void displaySummary() {

        if (students.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        System.out.println("\n====== SUMMARY ======");

        System.out.printf("Average Marks : %.2f\n", calculateAverage());

        System.out.println("Highest Score : " + highestScore());

        System.out.println("Lowest Score  : " + lowestScore());

        System.out.println("======================");
    }
}