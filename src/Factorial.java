import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Factorial{
public static void main(String [] args) {
        int n=897;
       BigInteger sum=new BigInteger("1");

        for(int i=1;i<=n;i++){
            sum=sum.multiply(new BigInteger(String.valueOf(i)));
        }

        String s=String.valueOf(sum);
        System.out.println(s);

        0
//String [] s1=s.split("");

//ArrayList<Integer> ls=new ArrayList<>();
//
//for(String i:s1){
//    ls.add(Integer.parseInt(i));
//}


   // System.out.println(ls);

}



}