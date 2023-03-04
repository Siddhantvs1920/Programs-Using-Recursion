package Recursion;

public class FactoUsingR {
    static int facto=1;
    public static void main(String[] args) {
       int x= calcFacto(5);
        System.out.println(x);
    }

    private static int calcFacto(int n) {
        if(n>0) {
            facto = facto * n;
            calcFacto(n - 1);
        }
        return facto;
    }
}
