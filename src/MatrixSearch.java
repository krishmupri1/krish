public class MatrixSearch {


    public static void main(String [] args){



        int A[][]=new int[][]{{2, 9, 12, 13, 16, 18, 18, 19, 20, 22},
                {29, 59, 62, 66, 71, 75, 77, 79, 97, 99}};
        int B=45;


                int left=0;
                int right=A[0].length-1;

System.out.println(right+1);
                while(left<A[0].length   &&    right>=0){
                    if(A[left][right]==B){System.out.println("1");}
                    else if(A[left][right]>B)right--;
                    else left++;


                }
                System.out.println("0");
            }
        }













