public class PowerFunction {

    public static int pow(int n,int k){
        //if(k==1)return n;
        if(k==0)return 1;
        if(k%2==0){
            System.out.println("if"+k);
            return pow(n*n,k/2);}
        else
        {
            System.out.println(k);
            return n*pow(n*n,(k-1)/2);}

    }
    public static void main(String[] args){
       System.out.println(pow(2,6));
    }
}
