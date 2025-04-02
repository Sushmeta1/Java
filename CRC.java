public import java.util.Scanner;

public class CRC {
    // Perform XOR operation between two binary strings
    private static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < b.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }

    // Perform CRC division
    private static String mod2div(String dividend, String divisor) {
        int pick = divisor.length();
        String temp = dividend.substring(0, pick);

        while (pick < dividend.length()) {
            if (temp.charAt(0) == '1') {
                temp = xor(temp, divisor) + dividend.charAt(pick);
            } else {
                temp = xor(temp, "0".repeat(pick)) + dividend.charAt(pick);
            }
            pick++;
        }

        if (temp.charAt(0) == '1') {
            temp = xor(temp, divisor);
        } else {
            temp = xor(temp, "0".repeat(pick));
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data
        System.out.print("Enter data: ");
        String data = scanner.next();

        // Input Key (Divisor)
        System.out.print("Enter key: ");
        String key = scanner.next();

        System.out.println("\nSender side...");
        
        // Append zeroes equal to the length of the key - 1
        String appendedData = data + "0".repeat(key.length() - 1);

        // Compute remainder using Mod-2 Division
        String remainder = mod2div(appendedData, key);
        System.out.println("Remainder : " + remainder);

        // Encoded Data (Data + Remainder)
        String encodedData = data + remainder;
        System.out.println("Encoded Data (Data + Remainder) : " + encodedData);

        // Receiver Side Verification
        System.out.println("\nReceiver side...");
        String checkRemainder = mod2div(encodedData, key);

        if (Integer.parseInt(checkRemainder) == 0) {
            System.out.println("correct message received");
        } else {
            System.out.println("error in received message");
        }

        scanner.close();
    }
}
