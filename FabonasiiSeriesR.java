package Recursion;

public class FabonasiiSeriesR {
    public static void main(String[] args) {
        int n=10;
        int i=0;
        int j=1;
        System.out.print(i+" "+j+" ");
        febonacii(i,j,n-2);

    }
    private static void febonacii(int i, int j,int n) {
        if(n==0)
            return ;
        int c=i+j;
        System.out.print(c+" ");
        febonacii(j,c,n-1);

    }
}
