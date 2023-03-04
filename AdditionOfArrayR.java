package Recursion;

public class AdditionOfArrayR {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        sumOfArray(0,a,0);
    }

    private static void sumOfArray(int i, int[] a, int sum) {
        if (i==a.length-1) {
            sum = sum + a[i];
            System.out.println(sum);
            return;
        }
        sum = sum + a[i];
        sumOfArray(i+1,a,sum);



    }
}
