import java.util.InputMismatchException;
import java.util.Scanner;

class NumberInputHandler {
    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Error: Negative numbers not allowed");
            } else {
                System.out.println("Output: " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input, enter a number");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberInputHandler.getNumber(); 
    }
}

