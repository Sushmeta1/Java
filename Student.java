public class Student {

    // Static variable (shared by all instances)
    static String universityName = "UPES";

    // Non-static variable (unique for each instance)
    String studentName;

    // Constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display the university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Non-static method to display student information.
    public void displayStudentInfo(){
        System.out.println("Student Name: " + this.studentName);
        displayUniversityName();
    }

    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        // Display university name (using the static method)
        Student.displayUniversityName(); // or universityName can be called directly from the Student Class.
        System.out.println(Student.universityName);

        // Display student information (showing unique student names)
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Change the university name (demonstrating the shared static variable)
        Student.universityName = "Graphic era university";

        // Display university name again (showing the change)
        Student.displayUniversityName();

        // Display student information again (showing the shared university name)
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}
