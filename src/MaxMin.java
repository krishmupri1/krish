
public class MaxMin {

    public static void main(String[] args)
    {
        Pair p=new Pair();
        int nums[]=new int[]{12,10,4,8,7,6,45,11};
        int i;
        if(nums.length%2==0) {
            if (nums[0] > nums[1]) {
                p.max = nums[0];
                p.min = nums[1];

            } else {
                p.max = nums[1];
                p.min = nums[0];
            }
            i=2;
        }
        else
        {
          p.max=nums[0];
          p.min=nums[0];
          i=1;
        }

while(i<nums.length-1){

    if(nums[i]<nums[i+1]){

        if(nums[i]<p.min){

            p.min=nums[i];

        }
        if(nums[i+1]>p.max){

            p.max=nums[i+1];

        }
    }
    else
    {
      if(nums[i]>p.max)p.max=nums[i];
      if(nums[i+1]<p.min)p.min=nums[i+1];
    }
    i=i+2;
}
    System.out.println(p.max+"and"+p.min);
    }



}
 class Pair{
    int max;
    int min;
}


