
public class Task6 {
   

    public static void main(String[] args) {
        int base = 3; 
        int exponent = 4; 
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int power(int base, int exponent) {
       
        if (exponent == 1) {
            return base;
        }
      
        return base * power(base, exponent - 1);
    }
}

    

