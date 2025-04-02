// Student class with default and parameterized constructors
public class exp4_1{
    public static void main(String[] args){
        Student student1 =new Student();
        student1.display();
        Student student2 =new Student("Shweta",20);
        student2.display();
    }
}
class Student {
    String name;1
    int age;

    // Default constructor
    public Student() {
        this.name = "Sushmeta Negi";//Default name
        this.age = 19;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student1 = new Student();
        student1.display();

        // Creating an object using the parameterized constructor
        Student student2 = new Student("Shweta", 20);
        student2.display();
    }
}
