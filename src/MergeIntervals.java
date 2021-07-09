import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {


    public static void main(String[] args){

        int  intervals[][] = new int[][]{{1,3},{2,6},{8,10},{15,18}};


        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));


        LinkedList<int[]> ls=new LinkedList<>();

        for(int[] a:intervals){

            if(ls.isEmpty()  ||    ls.getLast()[1]<a[0]){
                ls.add(a);
            }
            else{
ls.getLast()[1]=Math.max(a[1],ls.getLast()[1]);
            }
        }
        for(int [] x:ls)
System.out.println(x[0]+" "+x[1]);

int[][] s=ls.toArray(new int[ls.size()][]);

    }
}
