public class Ex4 {
    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
