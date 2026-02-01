import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
    public void removeStudent(int id) {
        Student s = findStudentById(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Student not found");
        }
    }
}
