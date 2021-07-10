import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class SearchInInfinite {



    public static void main(String [] args){
        int nums[]=new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};


        //the main problem is to find the uppper limit
        int target=16;


        int start=0;
        int end=1;

        while(target>nums[end]){

            int newStart=end+1;
            end+=(end-start+1)*2;
            start=newStart;

    }
        System.out.println(binarySearches(nums,start,end,target));
}

public static int binarySearches(int  nums[],int start,int end,int target) {
    while (start <= end) {

        int mid = (start + end) / 2;

        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) end = mid - 1;
        else start = mid + 1;
    }
    return -1;
    }





}
//TIME COMPEXITY=O(LOG(N)+LOG(N))
//SPACE COMPLEXITY=O(LOG(N))
