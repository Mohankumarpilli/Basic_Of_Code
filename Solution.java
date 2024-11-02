import java.util.Stack;

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st = new Stack<>();
        String str = "";
        for(int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);
            if( c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9'){
                st.push(String.valueOf(c));
            }else {
                String s1 = st.pop();
                String s2 = st.pop();
                String s3 = ("("+s2+c+s1+")");
                System.out.print(s3);
                st.push(s3);
            }
        }
        System.out.println("Hello");
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(postToInfix("ab+"));
    }
}