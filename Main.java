import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read input from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Calculate and print the square of the number
            int square = number * number;
            System.out.println("Square of the number: " + square);
        } catch (Exception e) {
            // Catch any exception that may occur
            System.out.println("Please enter valid data");
        } finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}
