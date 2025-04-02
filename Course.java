class Course {
    private String courseName;
    private String courseCode;

    // Constructor with parameters having the same name as instance variables
    public Course(String courseName, String courseCode) {
        this.courseName = courseName; // Using 'this' to refer to instance variable
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of Course class
        Course course = new Course("Data Structures", "CS101");
        
        // Displaying course details
        course.displayCourseDetails();
    }
}
