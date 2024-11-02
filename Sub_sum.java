public class Sub_sum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;
        int row=n*((n+1)/2);
        int [][] sub=new int[row][];
        int index=0;

        for(int st=0;st<n;st++){
            for(int ed=st;ed<n;ed++){
                sub[index]=new int[ed-st+1];
                int x=0;
                for(int k=st;k<=ed;k++){
                    sub[index][x]=arr[k];
                    x++;
                }
                index++;

            }
        }

    }
}
