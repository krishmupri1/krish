import java.util.*;

public class TopKFrequentElement {
   public static void main(String [] args){
       int nums[]=new int[]{1,2,3,1,2,2,3,3,3,3,4};
       int k=2;
HashMap<Integer,Integer> hm=new HashMap<>();
for(int i=0;i<nums.length;i++){
    hm.put(nums[i],1+hm.getOrDefault(nums[i],0));
}
PriorityQueue<Integer> pq=new PriorityQueue<>(5, (o1, o2) -> hm.get(o2)-hm.get(o1));
for(int v:hm.keySet()){
    pq.offer(v);
}

int sol[] =new int[k];
for(int i=0;i<k;i++){
    sol[i]=pq.poll();
    System.out.println(sol[i]);
}













}





    }

