import java.util.Arrays;

public class MergeInConstantSpace {



    public static void main(String [] args){

         int arr1[] = new int[] { 1, 5, 9, 10, 15, 20};
        int arr2[] = new int[] {2, 3, 8, 13};


        int n=arr1.length;
        int m=arr2.length;

        int i=0,j=0,k=n-1;
        while(i<=k && j<m){

            if(arr1[i]<arr2[j]){
                i++;
                System.out.println("i ka value"+i);
            }

            else{

                int temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                j++;
                k--;
            }


        }

       Arrays.sort(arr1);
        Arrays.sort(arr2);


for(int x:arr1)
System.out.print(x+" ");
        for(int x:arr2)
            System.out.println(x+" ");

    }
}
