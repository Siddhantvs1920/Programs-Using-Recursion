package Recursion;

public class TwoValueReturnByMethodWay3 {
    static int evenCount=0;
    static int oddCount=0;
    public static void main(String[] args) {
        int[] a={1,2,2,4,1,4};
        count(a,0);
        System.out.println(evenCount+" "+oddCount);

    }

    private static void count(int[] a, int i) {
        if (i<a.length)
        {
            if (a[i]%2==0)
                evenCount++;
            else
                oddCount++;
            count(a,++i);
        }
    }
}
