import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer, Student> records;

    public StudentRecordManager() {
        records = new TreeMap<>();
    }

    // Add a Student Record
    public void addStudent(int id, String name, double gpa) {
        if (records.containsKey(id)) {
            System.out.println("Student ID already exists. Cannot add the record.");
        } else {
            records.put(id, new Student(id, name, gpa));
            System.out.println("Student added successfully.");
        }
    }

    // Delete a Student Record
    public void deleteStudent(int id) {
        if (records.remove(id) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student ID not found. Deletion failed.");
        }
    }

    // Update a Student's GPA
    public void updateGpa(int id, double newGpa) {
        Student student = records.get(id);
        if (student != null) {
            student.setGpa(newGpa);
            System.out.println("GPA updated successfully.");
        } else {
            System.out.println("Student ID not found. Update failed.");
        }
    }

    // Display All Records
    public void displayAllRecords() {
        if (records.isEmpty()) {
            System.out.println("No records to display.");
        } else {
            for (Map.Entry<Integer, Student> entry : records.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Find Students with GPA Higher Than a Specified Value
    public void findStudentsWithGpaAbove(double threshold) {
        boolean found = false;
        for (Student student : records.values()) {
            if (student.getGpa() > threshold) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with GPA above " + threshold);
        }
    }
}
