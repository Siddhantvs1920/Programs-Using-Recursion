package Recursion;

public interface NoPatternR {
    public static void main(String[] args) {
        int irange=9;
        int jrange=9;
        loopI(0,irange,jrange);
    }

    static void loopI(int i, int irange, int jrange) {
        if (i<irange)
        {
            loopJ(i,0,jrange,1);
            System.out.println();
            i++;
            loopI(i,irange,jrange);
        }
    }

    static void loopJ(int i, int j, int jrange,int count) {
        if(j<jrange)
        {
            if(j-i<=0)
                System.out.print(count++);
            else
                System.out.print(" ");
            j++;
            loopJ(i,j,jrange,count);
        }
    }
}
