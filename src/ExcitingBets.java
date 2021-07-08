import java.util.Scanner;

public class ExcitingBets {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long moves=0,exit=0;

            if (a == b) {
                moves=0;
                exit=0;
            }
            else
            {
                long min=Math.min(a,b);
                long max=Math.max(a,b);

                exit=max-min;
if(min%exit==0){
    moves=0;
}
else
    moves=Math.min(exit-min%exit,min%exit);
            }
System.out.println(exit+" "+moves);
        }

    }}