import java.util.Scanner;

public class EuclideanAlgorithmWithoutRecursion {
    private static int getGreatestCommonDivisor(int number1, int number2) {
        while (number2 != 0) {
            int divisionRemainder = number1 % number2;
            number1 = number2;
            number2 = divisionRemainder;
        }

        return number1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value A:");
        int number1 = scanner.nextInt();

        System.out.println("Enter value B:");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Both numbers are 0, the GCD cannot be searched for.");
        } else {
            System.out.println("GCD: " + getGreatestCommonDivisor(number1, number2));
        }
    }
}
