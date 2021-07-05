import java.util.PriorityQueue;

public class KthMaxElement {

    static int max(int array[],int k){
       PriorityQueue<Integer> pq=new PriorityQueue<>();

       for(int v:array){
        pq.offer(v);
       }
       int i=0;
        while(i++<k-1){
            pq.poll();
        }

        return pq.peek();
    }

    public static void main(String [] args)
    {
     int array[]=new int[]{14,15,16,1,2,3,4,8,45};
     int k=3;

     System.out.println(max(array,k));





    }
}
