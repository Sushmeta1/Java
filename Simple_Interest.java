//Write a program to find simple interest.

public class Simple_Interest {
    public static void main(String[] args) {
    
        double principal = 100;
        double rate = 7;
        double time = 2;
    
        double simpleInterest = (principal * rate * time) / 100;
    
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

