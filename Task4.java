public class Task4 {
    public static void main(String[] args) {
        int n = 4; 
        int result = handshake(n);
        System.out.println("The total number of handshakes among " + n + " people is: " + result);
    }

    public static int handshake(int n) {
       
        if (n <= 1) {
            return 0;
        }
      
        return (n - 1) + handshake(n - 1);
    }
}

    

