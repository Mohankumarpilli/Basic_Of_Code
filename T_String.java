public class T_String {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3= new String("abc");
        if(s1 == s2){
            System.out.println("both are same");
        }
        else {
            System.out.println("both are not same");
        }
        if(s3 == s1){
            System.out.println("both are same");
        }
        else {
            System.out.println("both are not same");
        }

    }
}
