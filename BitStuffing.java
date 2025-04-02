import java.util.Scanner;

public class BitStuffing {
    public static String bitStuffing(String data) {
        StringBuilder stuffedData = new StringBuilder();
        int count = 0;

        for (char bit : data.toCharArray()) {
            stuffedData.append(bit);
            if (bit == '1') {
                count++;
                if (count == 5) { // After 5 consecutive 1s, insert a 0
                    stuffedData.append('0');
                    count = 0; // Reset count
                }
            } else {
                count = 0; // Reset count when a 0 is encountered
            }
        }
        return stuffedData.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary data: ");
        String inputData = scanner.next();
        
        System.out.println("Original Data: " + inputData);
        String stuffedData = bitStuffing(inputData);
        System.out.println("Stuffed Data: " + stuffedData);
        
        scanner.close();
    }
}
