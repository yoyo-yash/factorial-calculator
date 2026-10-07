import java.util.Scanner; // import scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // set up scanner object

        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // take user input

        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers."); // negative number warning
        } 
        else {
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.print("Factorial of " + num + " is: " + factorial); // prints result
        }

        scanner.close(); // closes scanner
    }
}