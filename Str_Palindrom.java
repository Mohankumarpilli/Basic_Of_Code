public class Str_Palindrom {
    public static void main(String[] args) {
        String s1 = "here";
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();
        System.out.println(s2);
        String rev= s2.toString();
        System.out.println(rev);
    }
}
