public class FactorialC {

    // Method to calculate factorial
    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int number = 5;

        long factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }
}

