public class Ex10 {
    public static int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        } else if (a == 0) {
            return b;
        } else if (a % 2 == 0 && b % 2 == 0) {
            return 2 * gcd(a / 2, b / 2);
        } else if (a % 2 == 0 && b % 2 != 0) {
            return gcd(a / 2, b);
        } else {
            return gcd(a, b - a);
        }
    }
}
