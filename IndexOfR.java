package Recursion;

public class IndexOfR {
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="ez";
        index(s1,s2,0);
    }

    private static void index(String s1, String s2, int i) {
        if (i<s1.length()) {

            if (s1.charAt(i) == s2.charAt(0)) {
                if (check(s1, s2, i, 0, 0) == 0)
                    System.out.println(i);
                return;
            }
            index(s1, s2, ++i);
        }

            


    }

    private static int check(String s1, String s2, int i, int j,int cnt) {
        if (j<s2.length())
        {
            if (s1.charAt(i)!=s2.charAt(j))
                return ++cnt;
            return check(s1,s2,++i,++j,cnt);
        }
        return cnt;
    }
}
