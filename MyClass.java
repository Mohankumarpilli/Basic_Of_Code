import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyClass {

    static int x = 10;

    public static void main(String[] args) {

        int k = 3;
        int sum = 0;
        int temp = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        while(k>0){
            temp = pq.remove();
            sum += temp;
            temp = (int) Math.ceil((double) temp/3);
            pq.add(temp);
            k--;
        }
        System.out.println(sum);
    }
}