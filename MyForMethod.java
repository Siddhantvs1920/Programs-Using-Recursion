package Recursion;

public class MyForMethod {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
            System.out.println(i);
        System.out.println("---------");
        //Implimentation of for Loop
        int i=1;
        loop(i);
    }

    private static void loop(int i) {
        if(i<=10)
        {
            System.out.println(i);
            i++;
            loop(i);
        }
    }
}

