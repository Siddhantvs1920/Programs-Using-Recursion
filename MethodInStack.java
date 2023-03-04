package Recursion;

public class MethodInStack {
    static int i=0;
    public static void main(String[] args) {
        System.out.println("in main");
        m1();
        System.out.println("out main");
    }

    private static void m1()
    {
        System.out.println("in m1");
        i++;
        if(i<5)
            m1();

        System.out.println("out m1");
    }

}
