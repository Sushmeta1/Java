public class Calc {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]); // First number
        int num2 = Integer.parseInt(args[2]); // Second number
        String operator = args[1]; // Operator (+, -, *)

        switch (operator) {
            case "+":
                System.out.println("sum is " + (num1 + num2));
                break;
            case "-":
                System.out.println("difference is " + (num1 - num2));
                break;
            case "*":
                System.out.println("product is " + (num1 * num2));
                break;
            default:
                System.out.println("use ops +, -, *");
                break;
        }
    }
}



















