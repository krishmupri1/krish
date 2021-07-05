import java.util.Arrays;
import java.util.Scanner;

public class Closest1 {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            while(k-->0){
                int temp=sc.nextInt();
                int left=-1;
                int right=array.length;

                while(left+1<right){
                    int mid=left+(right-left)/2;
                    if(temp>=array[mid]){
                        left=mid;
                    }
                    else right=mid;

                }
              System.out.println(left+1);
            }

        }}

