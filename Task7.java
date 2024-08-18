
public class Task7 {
    public static void main(String[] args) {
        String str = "hello"; 
        String reversed = reverse(str, str.length());
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str, int length) {
        
        if (length == 0) {
            return "";
        }
        return str.charAt(length - 1) + reverse(str, length - 1);
    }
}

    

