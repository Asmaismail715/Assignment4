
public class Task5 {
  public static void main(String[] args) {
        int x = 56; 
        int y = 98; 
        int result = gcd(x, y);
        System.out.println("The greatest common divisor of " + x + " and " + y + " is: " + result);
    }

    public static int gcd(int x, int y) {
       
        if (y == 0) {
            return x;
        }
      return gcd(y, x % y);
    }
}

    

