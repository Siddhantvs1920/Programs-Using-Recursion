package Recursion;

import SamePackages1.Siddhant;

import java.util.Arrays;

public class RemoveFristFromSecondR {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 4, 4, 2, 1, 3, 7};
        int[] b = {1, 2, 4};
        a=loopI(a, b, 0);
        System.out.println(Arrays.toString(a));
    }
    private static int[] loopI(int[] a,int[] b, int i) {
        if(i<b.length)
        {
            a=removeFromone(a,b[i],0);
           return loopI(a,b,++i);
        }
        return a;
    }

    private static int[] removeFromone(int[] a, int num, int i)
    {
        int count=getCount(a,num,0,0);
        int[] c=new int[a.length-count];
        int index=0;
        int cnt=0;
        siddhant(a,0,c,index,cnt,num);
        return c;
    }

    private static void siddhant(int[] a, int i, int[] c, int index, int cnt, int num) {
        if (i<a.length)
        {
            if (a[i]==num&&cnt<2)
                cnt++;
            else
                c[index++]=a[i];
            siddhant(a,++i,c,index,cnt,num);
        }
    }
    private static int getCount(int[] a, int num, int i,int count) {
        if(i<a.length)
        {
            if(num==a[i])
                count++;
            if(count>=2)
                return count;
           return getCount(a,num,++i,count);
        }
        return count;
    }
}
