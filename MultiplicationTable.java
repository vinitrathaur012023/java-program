import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number for the multiplication table: ");
        int num = scanner.nextInt();

        // Display multiplication table
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        // Close the Scanner
        scanner.close();
    }
}
