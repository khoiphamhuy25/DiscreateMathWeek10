public class Ex9 {
    public static void gen(int n, String s) {
        if (s.length() == n) {
            System.out.println(s);
        } else {
            gen(n, s + "()");
            gen(n, "()" + s);
            gen(n, "("+ s +")");
        }
    }
}
