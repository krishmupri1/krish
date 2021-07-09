public class SmallestCharacterGreaterThanTarget {



    public static void main(String [] args){

        char[] c=new char[]{'a','b','j','x','z'};
        char target='z';
//        int x= Integer.compare((int)c[4],(int)c[1]);
//     System.out.println(x);
int end=c.length-1;
int start=0;



while(start<=end){
    int mid=(start+end)/2;

   // System.out.println("mid"+mid);

    if(Character.compare(target,c[mid])>=0) {


        start = mid + 1;

    }
   // System.out.println("start"+start);}
    else if(Character.compare(target,c[mid])<0)
        end=mid-1;
   // System.out.println(end);
}

System.out.println(c[start%c.length]);

    }
}
