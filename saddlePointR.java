package Recursion;

public class saddlePointR {
    static int count=0;
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {8,5,6},
                {7,8,9}
        };
        loopI(a,0);
        if(count==0)
            System.out.println("no saddle point");
    }

    private static void loopI(int[][] a, int i) {
        if(i<a.length)
        {
            loopJ(a,i,0);
            loopI(a,++i);
        }

    }

    private static void loopJ(int[][] a, int i, int j) {
        if(j<a.length)
        {
            if(lowInRow(a,i,j,0)&&highInRow(a,i,j,0))
            {
                System.out.println(a[i][j]);
                count++;
            }
            loopJ(a,i,++j);
        }
    }

    private static boolean highInRow(int[][] a, int i, int j, int k) {
        if(k<a.length)
        {
            if (a[i][j]<a[k][j])
                return false;
          return   highInRow(a,i,j,++k);
        }
        return true;
    }

    private static boolean lowInRow(int[][] a, int i, int j, int k) {
        if(k<a.length)
        {
            if(a[i][j]>a[i][k])
                return false;
            return lowInRow(a,i,j,++k);
        }
        return true;

    }
}
