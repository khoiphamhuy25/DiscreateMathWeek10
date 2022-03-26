public class Ex3 {
    public static char m(String s) {
        if (s.length() == 1) {
            return s.charAt(0);
        } else if (s.charAt(0) > s.charAt(s.length() - 1)) {
            return m(s.substring(0, s.length() - 1));
        } else {
            return m(s.substring(1));
        }
    }
}
