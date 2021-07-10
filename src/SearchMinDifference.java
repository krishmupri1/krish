public class SearchMinDifference {

    public static void main(String[] args) {

        int nums[] = new int[]{4, 6, 16,20};
        int key = 17;
        int i = 0;
        int j = nums.length - 1;


        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == key) {
                System.out.println(nums[mid]);
                return;
            } else if (nums[mid] > key) j = mid-1;
            else
                i = mid + 1;
        }
if(i==nums.length){
    System.out.println(nums[j]);
    return;
}
        if((nums[i]-key)<(key-nums[j]))
            System.out.println(nums[i]);

        else
        System.out.println(nums[j]);
    }

}


















