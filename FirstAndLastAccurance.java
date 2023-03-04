package Recursion;

public class FirstAndLastAccurance {
    static int first=-1;
    static int last=-1;
    public static void main(String[] args) {
        String s="abadcdesacdabadea";
        FLAccceurace(s,0,'a');
    }

    private static void FLAccceurace(String s, int i, char ele) {
        if(i==s.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char ch=s.charAt(i);
        if(ch==ele)
        {
            if(first==-1)
                first=i;
            else
                last=i;
        }
        FLAccceurace(s,i+1,ele);
    }
}
