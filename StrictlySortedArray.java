package Recursion;

public class StrictlySortedArray {
    public static void main(String[] args) {
        int[] a={1,2,2,4,5};
        System.out.println(findSorted(a,0));
    }

    private static boolean findSorted(int[] a, int i) {
        if (i==a.length-1)
            return true;
        if(a[i]<a[i+1])
            return findSorted(a,i+1);
        else
            return false;
    }
}
