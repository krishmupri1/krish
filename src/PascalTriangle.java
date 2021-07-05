import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {


    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<>();
result.add(new ArrayList<>());
result.get(0).add(1);
        int array[]=new int[]{7,8,9,0,1,2,3,4};
        int a=Arrays.binarySearch(array,4,6,1);

        int number = 5;

        for (int i = 1; i < number; i++) {

            List<Integer> semiresult = new ArrayList<>();
            List<Integer> prev = result.get(i-1);

           semiresult.add(1);
            for (int j = 1; j < i; j++) {
                semiresult.add(prev.get(j-1) + prev.get(j));
            }
            semiresult.add(1);
            result.add(semiresult);
        }
        System.out.println(a+result.toString());

    }}






