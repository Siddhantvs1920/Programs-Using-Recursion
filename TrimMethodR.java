package Recursion;

public class TrimMethodR {
    public static void main(String[] args) {
        String s="     abdde dse      ";
        int start=startindex(s,0);
        int end=endindex(s,s.length()-1);
        //if (start!=-1)
        String s1="";
        s1=print(s,start,end,s1);
        System.out.println(s1);

    }

    private static String print(String s, int i, int j,String s1) {
        if(i<=j)
        {
            s1+=s.charAt(i);
            return print(s,++i,j,s1);
        }
        return s1;
    }

    private static int endindex(String s, int i) {
        if (i>=0)
        {
            if (s.charAt(i)!=' ')
                return i;
          return   endindex(s,--i);
        }
        return -1;
    }

    private static int startindex(String s, int i) {
        if(i<s.length())
        {
            if (s.charAt(i)!=' ')
                return i;
            return startindex(s,++i);
        }
        return -1;
    }
}
