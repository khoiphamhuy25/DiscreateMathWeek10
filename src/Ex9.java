public class Ex9 {
    public static void generate(int n, String s){
        if(s.length() == n){
            System.out.println(s + "\n");
        } else {
            String s1 = "{" + s + "}";
            String s2 = "[" + s + "]";
            String s3 = "(" + s + ")";
            generate(n,s1);
            generate(n,s2);
            generate(n,s3);
        }
    }
}
