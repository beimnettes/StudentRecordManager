public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        // Add Student Records
        manager.addStudent(101, "Alice", 3.5);
        manager.addStudent(102, "Bob", 2.8);
        manager.addStudent(103, "Charlie", 3.9);
        manager.addStudent(104, "Diana", 3.2);
        manager.addStudent(105, "Eve", 2.5);

        // Display All Records
        System.out.println("\nAll Student Records:");
        manager.displayAllRecords();

        // Update GPA
        System.out.println("\nUpdating GPA for ID 102:");
        manager.updateGpa(102, 3.3);

        // Display Updated Records
        System.out.println("\nUpdated Student Records:");
        manager.displayAllRecords();

        // Delete a Student Record
        System.out.println("\nDeleting Student with ID 105:");
        manager.deleteStudent(105);

        // Display Remaining Records
        System.out.println("\nRemaining Student Records:");
        manager.displayAllRecords();

        // Find Students with GPA Above 3.0
        System.out.println("\nStudents with GPA > 3.0:");
        manager.findStudentsWithGpaAbove(3.0);
    }
}

