import java.util.Scanner;

public class Ropes {
private static int n,k;
private static int nums[];
public static boolean   good(double  x){
    int s=0;
    for(int i=0;i<n;i++){
        s+=Math.floor(nums[i]/x);
    }
    return s>=k;

    }
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        double left=0;
        double right= (double) 10e8;

        for(int i=0;i<100;i++){
            double mid=left+(right-left)/2;
            if(good(mid))left=mid;
            else right=mid;
        }

System.out.println(String.format("%.1f",left));







    }





}
