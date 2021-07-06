import java.util.Arrays;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class MinimizeHeight {


    public static void main(String [] args){
       int arr[]=new int[]{2 ,6 ,3, 4, 7, 2, 10, 3, 2, 1};
                // code here7
        int n=arr.length;
        int k=5;
                Arrays.sort(arr);
                int ans=arr[n-1]-arr[0];
                int low=arr[0]+k;
                int high=arr[n-1]-k;




                for(int i=1;i<=n-1;i++){

                    int min=Math.min(low,arr[i]-k);


                    if(min<0)continue;
                   int  max=Math.max(high,arr[i-1]+k);

                    ans=Math.min(ans,max-min);
                }
                System.out.println(ans);
            }
        }

