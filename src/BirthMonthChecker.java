import java.util.Scanner;

public class BirthMonthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their birth month
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        // Check if the input is in the valid range
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        // Close the scanner
        scanner.close();
    }
}