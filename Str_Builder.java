public class Str_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" mohan");
        System.out.println(sb);
        sb.insert(5," i am ");
        System.out.println(sb);
    }
}
