import java.util.*;
public class Task8{


    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        int p = 3;
        System.out.println(minProduct(p));
    }

    public static int minProduct(int p) {
        int n = (1 << p) - 1; 
        int[][] bitCounts = new int[p][2]; 

   
        for (int i = 1; i <= n; i++) {
            for (int bit = 0; bit < p; bit++) {
                if ((i & (1 << bit)) != 0) {
                    bitCounts[bit][1]++;
                } else {
                    bitCounts[bit][0]++;
                }
            }
        }

        long product = 1;
        for (int bit = 0; bit < p; bit++) {
            
            long count0 = bitCounts[bit][0];
            long count1 = bitCounts[bit][1];
            long minCount = Math.min(count0, count1);
            product = (product * ((long) Math.pow(2, minCount))) % MOD;
        }

        return (int) product;
    }
}
