public class Ex2 {
    public static int ones(String s) {
        if (!s.isEmpty()) {
            if (s.charAt(0) == '0') {
                return ones(s.substring(1));
            } else if (s.charAt(0) == '1') {
                return 1 + ones(s.substring(1));
            }
        }
        return 0;
    }
}
