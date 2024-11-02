import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Linked_List {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next= new ListNode(0);
        temp=temp.next;
        temp.next=new ListNode(1);
        int cnt=0;
        int sum=0;
        temp = head;
        while(temp!=null){
            sum+=temp.val*(int)Math.pow(2,cnt);
            cnt++;
            temp=temp.next;
        }

        boolean[] arr = new boolean[5];
        Stack<Integer> st = new Stack<>();
        st.push(56);
        int x=st.pop();
        System.out.println(x);
    }
}
