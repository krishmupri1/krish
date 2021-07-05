public class Solution {


    public long good(long mid,long nums[]){
        long sum=0;
        for(long p:nums){
            if(p>mid)sum+=p-mid;
        }
        return sum;
    }
    public long solve(long[] A, long B) {

        long left=0;
        long right=longeger.MIN_VALUE;

        for(long i=0;i<A.length;i++){
            right=Math.max(right,A[i]);
        }
        long mid=-1;
        while(left<right){
            mid=left+(right-left)/2;
            if(good(mid,A)==B ||left==mid)return mid;
            else if(good(mid,A)>B)left=mid;
            else right=mid;
        }

        return mid;
    }



}
