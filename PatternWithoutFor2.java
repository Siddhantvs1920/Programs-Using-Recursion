package Recursion;

public class PatternWithoutFor2 {
    public static void main(String[] args) {
        loopI(0);
    }

    private static void loopI(int i) {
        if(i<9)
        {
            loopj(i,0);
            System.out.println();
            i++;
            loopI(i);
        }
    }

    private static void loopj(int i, int j) {
        if (j<5)
        {
            if(j-i<=0&&j+i<=8)
                System.out.print("*");
            else
                System.out.print(" ");
            j++;
            loopj(i,j);
        }
    }
}
