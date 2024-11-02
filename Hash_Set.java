import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        char[] a = {'a','v','g','y'};
        int k=0;
        int x=a.length-1;

        while(k<x){
            char temp = a[k];
            a[k]=a[x];
            a[x]=temp;
            k++;
            x--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
