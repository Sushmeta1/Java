public public class Cal {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        // ... (your Cal class main method)
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of two doubles: " + calc.add(10.5, 20.5));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
    }
}