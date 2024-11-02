import java.util.*;

public class HashMaps<I extends Number, I1 extends Number> {
    public static void main(String[] args) {
//        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
//        map.put(0,"0");
//        map.put(1,"1");
//        map.put(2,"abc");
//        map.put(3,"def");
//        map.put(4,"ghi");
//        map.put(5,"jkl");
//        map.put(6,"mno");
//        map.put(7,"pqrs");
//        map.put(8,"tuv");
//        map.put(9,"wxyz");
//        System.out.println(map.get(4));
//             int[] A={1,2,3,1,1,3};
//        java.util.HashMap<Integer, Integer> fer = new java.util.HashMap<>();
//        for(int i=0;i<A.length;i++){
//            if(fer.containsKey(A[i])){
//                fer.replace(A[i],fer.get(A[i]),fer.get(A[i])+1);
//            }else{
//                fer.put(A[i],1);
//            }
//        }
//        int count=0;
//            for(Map.Entry<Integer, Integer> i : fer.entrySet()){
//                if(i.getValue()>=2){
//                    count+=(i.getValue() * (i.getValue() - 1) / 2);
//                }
//            }
//        System.out.println(count);
//        System.out.println(fer);
//        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//
//        // Inserting values into the 2D ArrayList
//        A.add(new ArrayList<>(List.of(1, 2, 3, 4, 1)));
//        A.add(new ArrayList<>(List.of(5, 8, 7, 8, 8)));
//        A.add(new ArrayList<>(List.of(9, 4, 3, 2, 4)));
//        ArrayList<java.util.HashMap<Integer, Integer>> fre = new ArrayList<>();
//        for(int i=0;i< A.size();i++){
//            ArrayList<Integer> row = A.get(i);
//            java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//            for(int j=0;j<row.size();j++){
//                if(hm.containsKey(row.get(j))){
//                    hm.replace((row.get(j)),hm.get(row.get(j)),hm.get(row.get(j))+1);
//                }else{
//                    hm.put(row.get(j),1);
//                }
//            }
//            fre.add(hm);
//        }
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        for(int i=0;i< fre.size();i++){
//            java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//            ArrayList<Integer> str = new ArrayList<>();
//            hm=fre.get(i);
//            for(Map.Entry<Integer, Integer> j : hm.entrySet()){
//                if(j.getValue()<2){
//                    str.add(j.getKey());
//                }
//            }
//            ans.add(str);
//        }
//        System.out.println(ans);
////        int[][] answer = new int[A.length][];
////        for(int i=0;i<ans.size();i++){
////            ArrayList<Integer> row = new ArrayList<>();
////            row=ans.get(i);
////            answer[i] = new int[row.size()];
////            for(int j=0;j< row.size();j++){
////                answer[i][j]=row.get(j);
////            }
////        }
////        for(int i=0;i<answer.length;i++){
////            for(int j=0;j<answer[i].length;j++){
////                System.out.print(answer[i][j]);
////            }
////            System.out.println();
////        }
//        String A="queue";
//        java.util.HashMap<Integer, Integer> fre = new java.util.HashMap<>();
//        for(int i=0;i<A.length();i++){
//            if(fre.containsKey(A.charAt(i))){
//                fre.replace((int)A.charAt(i),fre.get((int)A.charAt(i))+1);
//            }else{
//                fre.put((int)A.charAt(i),1);
//            }
//        }
//        int res=1;
//        for(Map.Entry<Integer, Integer> k:fre.entrySet()){
//            res=fact(k.getValue());
//        }
//        String s= "khgfjsa";
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        String ans="";
//        for(int i=0;i<arr.length;i++) {
//            ans+=arr[i];
//        }
//        System.out.println(ans);
//        ArrayList<Integer> A = new ArrayList<>();
//        //6,3,3,6,7,8,7,3,7
//        A.add(6);
//        A.add(3);
//        A.add(3);
//        A.add(6);
//        A.add(7);
//        A.add(8);
//        A.add(7);
//        A.add(3);
//        A.add(7);
//        ArrayList<Integer> B = new ArrayList<>();
//        B.add(10);
//        B.add(9);
//        B.add(8);
//       java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//        for(int i=0;i<A.size();i++){
//            if(hm.containsKey(A.get(i))){
//                hm.replace(A.get(i),hm.get(A.get(i))+1);
//            }else{
//                hm.put(A.get(i),1);
//            }
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i=0;i<B.size();i++){
//            ans.add(hm.get(B.get(i)));
//        }
//        System.out.println(ans);
//        for(int i=0;i<A.size();i++){
//            if(hm.containsKey(A.get(i))){
//                hm.replace(A.get(i),hm.get(A.get(i))+1);
//            }else{
//                hm.put(A.get(i),1);
//            }
//        }
//        System.out.println(hm.size());
//        int[] A = {4, -1, 1};
//        int[] pf = new int[A.length];
//        pf[0]=A[0];
//        for(int i=1;i<A.length;i++){
//            pf[i]=pf[i-1]+A[i];
//        }
//        ArrayList<Integer> reas=new ArrayList<>();
//        reas.contains()
//        HashMap<Long,Long> ana= new HashMap<>();
//        for(int i=0;i<pf.length;i++){
//            if(hm.containsKey(pf[i])){
//                hm.replace(pf[i],hm.get(pf[i])+1);
//            }else{
//                hm.put(pf[i],1);
//            }
//        }
//        if(hm.size()==A.length){
//            if(hm.containsKey(0)){
//                System.out.println("true");
//            }
//        }
//        if(hm.size()!=A.length){
//            System.out.println("true");
//        }
//        int[] A = {30,-30,30,-30};
//
//        java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//        for(int i=0;i<A.length;i++){
//            if(hm.containsKey(A[i])){
//                hm.replace(A[i],hm.get(A[i])+1);
//            }else{
//                hm.put(A[i],1);
//            }
//        }
//        int count=0;
//
//        for(int i=0;i<A.length;i++){
//            if(hm.containsKey(A[i])){
//                if(hm.containsKey((-A[i]))){
//                    count++;
//                    hm.replace((-A[i]),hm.get((-A[i]))-1);
//                }
//                if(hm.get(A[i])==0){
//                    hm.remove(A[i]);
//                }
//            }
//        }
//        System.out.println(count);
//        int[] A = {1,2,3,4,5};
//        int B= 5;
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        int l=0;
//        int r=0;
//        int sum=0;
//        while(r<A.length){
//            if(sum<B){
//                sum+=A[r];
//                r++;
//            }else if(sum>B){
//                sum-=A[l];
//                l++;
//            }else{
//                int[] ans= new int[r-l+1];
//                int j=0;
//                for(int i=l;i<=r;i++){
//                    ans[j]=A[i];
//                    j++;
//                }
//                for (int an : ans) {
//                    System.out.print(an + " ");
//                }
//            }
//        }
//        int[] A = {3,1,3};
//        java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//        for(int i=0;i<A.length;i++){
//            hm.put(A[i],i);
//        }
//        System.out.println(hm);
        //1,1000000000
        ////1000000000
//        int[] A = {1,2,3,4,5};
//        int B=5;
//        java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//        int sum=0;
//        int l=0;
//        for(int i=0;i<A.length;i++){
//            if(sum==B){
//                int[] ans = new int[hm.size()];
//                int k=0;
//                for(Map.Entry<Integer,Integer> j : hm.entrySet()){
//                    ans[k]=j.getValue();
//                    k++;
//                }
//                return ans;
//            }
//            if(sum<B){
//                sum=A[i]+sum;
//                hm.put(i,A[i]);
//            }
//            if(sum>B){
//                sum=sum-A[l];
//                hm.remove(l);
//            }
//        }
//        int[] A = {1,2,3,4,5};
//        int B =5;
//        int l=0;
//        int r=0;
//        long sum=A[l];
//        while(r<A.length){
//            if(sum<B){
//                r++;
//                sum+=A[r];
//            }else if(sum>B){
//                sum-=A[l];
//                l++;
//            }else{
//                int[] ans= new int[r-l+1];
//                int j=0;
//                for(int i=l;i<=r;i++){
//                    ans[j]=A[i];
//                    j++;
//                }
//                for(int i : ans){
//                    System.out.print(i+"  ");
//                }
//                break;
//            }
//        }
//        int[] nums = {3,2,3};
//        java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            if(hm.containsKey(nums[i])){
//                hm.replace(nums[i],hm.get(nums[i])+1);
//            }else{
//                hm.put(nums[i],1);
//            }
//        }
//        System.out.println(hm);
//        int max=0;
//        int fre=0;
//        for(Map.Entry<Integer,Integer> i : hm.entrySet()){
//            if(fre<i.getValue()){
//                fre=i.getValue();
//                max=i.getKey();
//            }
//        }
//        System.out.println(max);
        String[] words = {"abc","car","ada","racecar","cool"};
//        String ans = "";
//        for(int i=0;i<words.length;i++){
//            String rev = words[i];
//
//            boolean status = false;
//            int r=rev.length()-1;
//            int l=0;
//            while(l<r){
//                if(rev.charAt(l)==rev.charAt(r)){
//                    status = true;
//                }
//                if(rev.charAt(l)!=rev.charAt(r)){
//                    status = false;
//                    break;
//                }
//                r--;
//                l++;
//            }
//            if(status){
//                ans=words[i];
//                break;
//            }
//        }
//        System.out.println(ans);
//        int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
//        int[] max_col = new int[matrix[0].length];
//
//        for(int i=0;i<matrix.length;i++){
//            int max=0;
//            for(int j=0;j<matrix.length;j++){
//                max= Math.max(max,matrix[j][i]);
//            }
//            max_col[i]=max;
//        }
//        for(int i=0;i<max_col.length;i++){
//            System.out.println(max_col[i]);
//        }
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(matrix[i][j]==-1){
//                    matrix[i][j]=max_col[j];
//                }
//            }
//        }
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//        String nums="2046";
//        String ans="";
//        int n=-1;
//        for(int i=0;i<nums.length();i++){
//            char ele = nums.charAt(i);
//            int x=(int)ele-'0';
//            //System.out.print(x+"  ");
//            if(x%2==1){
//                if(x>n){
//                    n=x;
//                }
//            }
//        }
//        ans= nums.substring(0,2);
//        System.out.println(ans);
//        System.out.println(n);
//        ans+=n;
//        System.out.println(ans);
//        int[] A = {1,3,1};
//        int max=0;
//        for(int i=0;i<A.length;i++){
//            max=Math.max(max,A[i]);
//        }
//        int[] max1 = new int[max+1];
//        for(int i=0;i<A.length;i++){
//            max1[A[i]]=max1[A[i]]+1;
//        }
//        int x=0;
//        int[] ans = new int[A.length];
//        for(int i=0;i<max1.length;i++){
//            int ele = max1[i];
//            for(int j=0;j<ele;j++){
//                ans[x]=i;
//                x++;
//            }
//        }
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }
//        int[] arr = {-3,-5,-1,4,7,2};
//        int max=0;
//        int min=0;
//        for(int i=0;i<arr.length;i++){
//            max=Math.max(max,arr[i]);
//            min=Math.max(min,arr[i]);
//        }
//        int[] fre = new int[max-min+1];
//        for(int i=0;i<arr.length;i++){
//            int ele = arr[i]+Math.abs(min);
//            fre[ele]++;
//        }
//        int[] ans = new int[arr.length];
//        int x=0;
//        for(int i=min;i<=max;i++){
//            int ele = fre[i+Math.abs(min)];
//            for(int j=0;j<ele;j++){
//                ans[x]=i;
//                x++;
//            }
//        }
//        for(int i : ans){
//            System.out.print(i+"  ");
//        }
//        int[] arr = {1,2,3,4,4};
//        int i=0;
//        int j=0;
//        int count=0;
//        while(i<arr.length){
//
//            if(arr[i]==arr[j] && i!=j){
//                count++;
//            }
//            j++;
//            if(j==arr.length-1){
//                j=0;
//                i++;
//            }
//        }
//        System.out.println(count);
//        int[] nums = {1,2,3};
//        int index=0;
//        for(int i=nums.length-2;i>=0;i--){
//            if(nums[i]<nums[i+1]){
//                System.out.println(nums[i]);
//                index=i;
//                break;
//            }
//        }
//        for(int i=nums.length-1;i>index;i--){
//            if(nums[i]>nums[index]){
//                int temp=nums[i];
//                nums[i]=nums[index];
//                nums[index]=temp;
//                break;
//            }
//        }
//        int i=index+1;
//        int j=nums.length-1;
//        while(i<j){
//            int temp=nums[i];
//            nums[i]=nums[j];
//            nums[j]=temp;
//            i++;
//            j--;
//        }
//        for(int k : nums){
//            System.out.print(k);
//        }
//        System.out.println(2%1);
        //int k=4;
//        int[] arr = {4,3,1,1,3,3,2};
//        java.util.HashMap<Integer,Integer> hm = new java.util.HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(hm.containsKey(arr[i])){
//                hm.replace(arr[i],hm.get(arr[i])+1);
//            }else{
//                hm.put(arr[i],1);
//            }
//        }
//        int a=1;
//        for(Map.Entry<Integer,Integer> i : hm.entrySet()){
//            if(a==k){
//                break;
//            }
//            if(i.getValue()==1){
//                hm.remove(i);
//                a++;
//            }
//        }
//        System.out.println(hm);
//        int[] left = {2,4,6,8,10};
//        int[] rigth = {3,5,7,9,11,13};
//        int[] ans = new int[left.length+ rigth.length];
//        int i=0;
//        int j=0;
//        int index=0;
//        while(i<left.length || j<rigth.length){
//           if(i< left.length && j< rigth.length && left[i]<rigth[j]){
//               ans[index]=left[i];
//               i++;
//               index++;
//           }else if(i< left.length && j< rigth.length && rigth[j]<left[i]){
//               ans[index]=rigth[j];
//               j++;
//               index++;
//           }else if(j< rigth.length){
//               ans[index]=rigth[j];
//               j++;
//               index++;
//           }else if(i< left.length){
//               ans[index]=left[i];
//               i++;
//               index++;
//           }
//        }
//        for(i=0;i<ans.length;i++){
//            System.out.print(ans[i]+"   ");
//        }
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.set(2,10);
//        System.out.println(a);
//
//        ArrayList<Integer> A = new ArrayList<>();
//        A.add(8);
//        A.add(89);
//        Collections.sort(A,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer a,Integer b){
//                String s1="";
//                s1+=a;
//                String s2="";
//                s2+=b;
//                int num1 = Integer.parseInt(s1+s2);
//                int num2 = Integer.parseInt(s2+s1);
//                if(num1>num2){
//                    return -1;
//                }
//                return 1;
//            }
//        });
//        System.out.println(A);
//        String ans = "";
//        for(int i=0;i<A.size();i++){
//            ans+=A.get(i);
//        }
//        int pos=0;
//        for(int i=0;i<ans.length();i++){
//            if(ans.charAt(i)==0){
//                pos=i;
//            }else{
//                break;
//            }
//        }
//        System.out.println(ans.substring(pos,ans.length()));
//
        int[] A = {3,5,7,1,4,2,8,6};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<A.length;i++){
            maxHeap.add(A[i]);
        }
        while(maxHeap.size()>0){
            System.out.print(maxHeap.poll()+" ");
        }
        for(int i=0;i<A.length;i++){
            maxHeap.add(A[i]);
        }
        int ans=0;
        while(maxHeap.size()>1){
            System.out.print(maxHeap.peek()+" n1 ");
            int n1 = maxHeap.poll();
            System.out.print(maxHeap.peek()+" n2 ");
            int n2 = maxHeap.poll();
            int sum = Math.abs(n2-n1);
            System.out.print(sum+" sum");
            maxHeap.add(sum);
            System.out.println();
        }
        System.out.println(maxHeap.size());
        if(maxHeap.size()>0){
            ans+=maxHeap.poll();
        }
        System.out.println(ans);
    }
//    public int solve(ArrayList<Integer> A) {
//        Collections.sort(A,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer a, Integer b){
//                if(fact(a)!=fact(b)){
//                    if(fact(a)<fact(b)){
//                        return 1;
//                    }else{
//                        return -1;
//                    }
//                }
//
//                return -1;
//            }
//        });
//        return A;
//    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return (fact(n-1)*n);
    }
}
