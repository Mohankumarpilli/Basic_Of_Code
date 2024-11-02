public class Equilibrium_Index {
    public static void main(String[] args) {
        int[] arr={-7,1,5,2,-4,3,0};



        /*for(int i=0;i< arr.length;i++){
            int lsum=0;
            for(int j=0;j<i;j++){
                lsum=lsum+arr[j];
            }
            System.out.print(" "+lsum+" ");
            int rsum=0;
            for(int k=i+1;k< arr.length;k++){
                rsum=rsum+arr[k];
            }
            System.out.print("-");
            System.out.print(" "+rsum+" ");
            System.out.println();
        }*/
        int[] pf=new int[arr.length];
        int n= arr.length;
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }

        int lsum=0;
        int rsum=0;
        int count=0;
        for(int i=0;i<n;i++){

            if(i>0) {lsum=pf[i-1];}


                rsum=pf[n-1]-pf[i];

            if(lsum==rsum){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
