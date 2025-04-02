// Calculator.java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Cal.java
public class Cal {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of two doubles: " + calc.add(10.5, 20.5));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
    }
}

// CalorDemo.java
public class CalorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(5, 8));
    }
}