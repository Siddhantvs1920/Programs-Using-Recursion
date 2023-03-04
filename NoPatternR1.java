package Recursion;

public class NoPatternR1 {
    public static void main(String[] args) {
        int irange=5;
        int jrange=9;
        loopI(0,irange,jrange,1);
    }

    static void loopI(int i, int irange, int jrange , int count) {
        if (i<irange)
        {
            loopJ(i,0,jrange,count++);
            System.out.println();
            i++;
            loopI(i,irange,jrange,count);
        }
    }

    static void loopJ(int i, int j, int jrange,int count) {
        if(j<jrange)
        {
            if(j-i<=0||j+i>=8)
                System.out.print(count);
            else
                System.out.print(" ");
            j++;
            loopJ(i,j,jrange,count++);
        }
    }

}
