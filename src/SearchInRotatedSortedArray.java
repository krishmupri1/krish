public class SearchInRotatedSortedArray {

    public static void main(String [] args)
    {
        int nums[]=new int[]{5,1,3};

        int target=1;
        //int target=2;


        int i=0;
        int j=nums.length-1;

        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]>nums[j]){
                i=mid+1;
            }
            else
                j=mid;
        }
System.out.println(i);

        int start=i;
        i=0;
        j=nums.length-1;


            if(target>=nums[start]   &&   target<=nums[j]){
                i=start;
            }
            else j=start-1;


        while(i<=j){
           int mid=(i+j)/2;
           if(target==nums[mid]){System.out.println(mid);break;}
           else if(target>nums[mid])i=mid+1;
           else
               j=mid-1;
        }






    }



}
