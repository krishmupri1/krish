import java.util.*;
public class SpiralOrder {

        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public static void main(String[] args){
int A[][]={{1,2,3},{4,5,6},{7,8,9}};
            List<Integer> ls=new LinkedList<>();

            int n=A.length;
            int m=A[0].length;

            int up=0;
            int down=n-1;

            int left=0;
            int right=m-1;


            while(ls.size()<n*m){
                for(int i=left;i<=right  && ls.size()<n*m ;i++)
                    ls.add(A[up][i]);


                for(int i=up+1;i<=down-1  && ls.size()<n*m;i++)
                    ls.add(A[i][right]);

                for(int i=right;i>=left   && ls.size()<n*m;i--)
                    ls.add(A[down][i]);


                for(int i=down-1;i>=up+1  && ls.size()<n*m;i--)
                    ls.add(A[i][left]);


                left++;right--;up++;down--;

            }

            int[] arr = new int[ls.size()];


            for (int i =0; i < ls.size(); i++)
            {arr[i] = ls.get(i);
            System.out.println(arr[i]);
            }

        }
    }






