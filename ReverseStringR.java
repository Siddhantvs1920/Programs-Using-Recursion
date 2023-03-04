package Recursion;

public class ReverseStringR {
    public static void main(String[] args) {
        String s="abcdef";
        int n=s.length()-1;
        reverseString(s,n);

    }

    private static void reverseString(String s, int n) {
        if (n==0)
        {
            System.out.print(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        reverseString(s,n-1);
    }
}
