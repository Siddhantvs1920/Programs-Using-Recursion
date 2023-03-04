package Recursion;

public class UniqurPairs {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 1, 3};
        a = removeDublicate(a);
        print(a, 0);
    }

    private static void print(int[] a, int i) {
        if (i<a.length)
        {
            print1(a,i,i+1);
            print(a,++i);
        }
    }

    private static void print1(int[] a, int i, int j) {
        if (j< a.length)
        {
            System.out.println(a[i]+" "+a[j]);
           print1(a,i,++j);
        }
    }

    private static int[] removeDublicate(int[] a) {
        int unique=getUniqueCount(a,0,0);
        int[] b=new int[unique];
        int index=0;
        fillB(a,b,0,0);
        return b;
    }

    private static void fillB(int[] a,int[] b, int i,int index) {
        if (i<a.length)
        {
             if (loopj(a,i,0,0)==0)
                b[index++]=a[i];
            fillB(a,b,++i,index);
        }
    }

    private static int loopj(int[] a, int i, int j, int cnt) {
        if (j<i)
        {
            if (a[i]==a[j])
                cnt++;
            return loopj(a,i,++j,cnt);
        }
        return cnt;
    }

    private static int getUniqueCount(int[] a,int cnt,int i) {
        if (i<a.length)
        {
            if (getCnt(a,i,0,0)==0)
                cnt++;
            return getUniqueCount(a,cnt,++i);
        }
        return cnt;

    }

    private static int getCnt(int[] a, int i, int j, int cnt) {
        if (j<i)
        {
            if (a[i]==a[j])
                cnt++;
            return getCnt(a,i,++j,cnt);
        }
        return cnt;
    }
}
