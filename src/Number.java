import java.util.Arrays;
import java.util.Comparator;

public class Number {
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder();
       int n=1154;
       while(n>=1){
           int rem=n%10;
           sb.insert(0,rem);
           n/=10;
       }
       System.out.println(sb.toString());

        String s[]=new String[]{"abc","ddef","qwertyu","g","zx"};
        //String x[]=new String[]{};
        //x=s.clone();
int A[]=new int[]{0,0};
        String[] x=new String[A.length];
        for(int i=0;i<A.length;i++){
            x[i]=String.valueOf(A[i]);
        }
        Arrays.sort(x,
                new Comparator<String>(){
                    @Override
                    public int compare(String a,String b){
                        String j=a+b;
                        String k=b+a;

                        return j.compareTo(k);
                    }});
StringBuilder s1=new StringBuilder();
System.out.println(x[x.length-1]);


if(x[x.length-1].equals("0"))System.out.println("0");
else{
for(int i=x.length-1;i>=0;i--){
    s1.append(x[i]);
}
        System.out.println(s1.toString());}
int [][] array={{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(array[0][0]);


                }
    }
