import java.util.Arrays;
import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String [] args) {

        int nums[] = new int[]{5, 7, 7, 8, 8, 10};

        int target = 6;
        int[] a = solve(nums, target);
    }
    public static int[]  solve(int [] nums,int target){
        int i=0;
        int j=nums.length-1;


        int sol[]=new int[]{-1,-1};
        if(nums.length==0)return sol;
        if(nums.length==1 && nums[0]==target)return new int[]{0,0};
        else if(nums.length==1 &&  nums[0]!=target)return sol;
        while(i<j){

            int mid=(i+j)/2;

            if(nums[mid]<target)i=mid+1;
            else j=mid;
        }

        if(nums[i]==target)sol[0]=i;
        else return sol;


        j=nums.length-1;

        while(i<j){
            int mid=((i+j)/2)+1;

            if(nums[mid]>target)j=mid-1;
            else i=mid;
        }
        sol[1]=j;



        return sol;



    }}




























