import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {

    public static void main(String [] args)
    {
        int nums[][]=new int[][]{{1,2,3,4},{2,2,3,4},
                {5,5,6,6},{7,8,9,9}};
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                pq.offer(nums[i][j]);
            }
        }
        ArrayList<Integer> ls=new ArrayList<>();
        while(pq.size()>0){
            ls.add(pq.poll());
        }
        System.out.println(ls.toString());

    }
}
