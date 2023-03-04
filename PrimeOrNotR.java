package Recursion;

public class PrimeOrNotR {
    public static void main(String[] args) {
        int num=17;
        int cnt=checkCount(2,num,0);
        if (cnt==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    private static int checkCount(int i, int num, int count) {
        if(i<num) {
            if (num % i == 0)
                count++;

           return checkCount(i+1, num, count);
        }
        return count;
    }
}
