package Recursion;

public class TwoValueReturnByMethodWay2 {
    public static void main(String[] args) {
        int[] a={1,2,4,4,2,1};
        Data data=new Data();
        count(a,data,0);
     }

    private static void count(int[] a, Data data, int i) {
        if (i<a.length)
        {
            if (a[i]%2==0)
                data.EvenCount++;
            else
                data.OddCount++;
            count(a,data,++i);
        }
    }
}
class Data
{
    int EvenCount=0;
    int OddCount=0;
}
