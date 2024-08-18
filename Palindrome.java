public class Palindrome {

  
    public static boolean isPalindrome(String s, int len) {
     
        if (len <= 1) {
            return true;
        }
        
        
        if (s.charAt(0) == s.charAt(len - 1)) {
          
            return isPalindrome(s.substring(1, len - 1), len - 2);
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        String s = "radar";
        int len = s.length();

        if (isPalindrome(s, len)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
