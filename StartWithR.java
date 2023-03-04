package Recursion;

public class StartWithR {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="";
        System.out.println((check(s1,s2,0)));
    }

    private static boolean check(String s1, String s2, int i) {
        if (s2.length()<=s1.length())
        {
            if (i<s2.length())
            {
                if (s1.charAt(i)!=s2.charAt(i))
                    return false;
                   return check(s1,s2,++i);
            }
            return true;
        }
        else
            return false;
    }
}
