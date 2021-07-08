import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String [] args){
        int nums[]=new int[]{1,4,6,6,2};
        Set<Integer> s=new HashSet<Integer>();

int sum=0;
        for(int i:nums){s.add(i);
        sum+=i;
        };


int sum1=0;
        for(int i:s){
          sum1+=i;
        }




        System.out.println(sum-sum1);
    }


}
