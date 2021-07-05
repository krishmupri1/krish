import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int nums[] = new int[2*n];

            for (int i = 0; i < 2 * n; i++) {
                nums[i] = sc.nextInt();
            }

            int countOdd = 0;
            int countEven = 0;
            for (int x : nums) {
                if (x % 2 == 0) countEven++;
                else countOdd++;
            }

            if (countEven == countOdd) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}
