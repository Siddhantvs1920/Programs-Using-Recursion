package Recursion;

public class PatternWithoutFor1 {
    public static void main(String[] args) {
        loopI(0);

    }

    private static void loopI(int i) {
        if(i<5)
        {
            loopJ(i,0);
            System.out.println();
            i++;
            loopI(i);
        }
    }

    private static void loopJ(int i,int j) {
        if (j<5)
        {
            if (j+i>=4)
                System.out.print("*");
            else
                System.out.print(" ");
            j++;
            loopJ(i,j);
        }
    }
}
