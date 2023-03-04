package Recursion;

public class PrintNNumbers {

    public static void main(String[] args) {

        printSum(1,10,0);


    }

    public static void printSum(int i, int n,int sum)
    {
        if(i<=n){
        sum=sum+i;
        printSum(i+1,n,sum);}
        else
            System.out.println(sum);

    }
}
