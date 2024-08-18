
public class Task3 {
    public static void main(String[] args) {
        int number = 220;
        int digit = 2;
        int result = count_digit(number, digit);
        System.out.println("The digit " + digit + " appears " + result + " times in the number " + number);
    }

    public static int count_digit(int n, int digit) {
       
        if (n == 0) {
            return 0;
        }
        
     
        if (n % 10 == digit) {
          
            return 1 + count_digit(n / 10, digit);
        } else {
          

    
}
