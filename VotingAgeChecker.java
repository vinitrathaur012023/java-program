import java.util.Scanner;

public class VotingAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if age is greater than or equal to 18
        if (age >= 18) {
            System.out.println("You are old enough to vote in a national election.");
        } else {
            System.out.println("You are not old enough to vote in a national election.");
        }

        scanner.close();
    }
}
