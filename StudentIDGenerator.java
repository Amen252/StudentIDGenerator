import java.util.Random;
import java.util.Scanner;

public class StudentIDGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your faculty: ");
        String faculty = scanner.nextLine().toUpperCase();

        System.out.print("Enter your year of entry (e.g., 2024): ");
        int yearEntry = scanner.nextInt();

        // Setting class number
        int classNumber = 1;

        // Generating random number
        int randomNumber = (int) (Math.random() * 10000); // Random number between 0 and 9999 and we need 4 numbers

        // Generating student ID
        char facultyCode = faculty.charAt(0);
        int lastTwoDigitsOfYear = yearEntry % 100; // giving to us to digit numbers from year entry

        // Generating student ID
        String studentID = (" " + facultyCode + classNumber + lastTwoDigitsOfYear + randomNumber);

        // Output student ID
        System.out.println("Your student ID is: " + studentID);

        // Generating Student Password
        Random random = new Random();
        int min = 100000;
        int max = 999999;
        int studentPassword = random.nextInt(max - min + 1) + min;
        System.out.println("Your Student Password is: " + studentPassword);
    }
}
