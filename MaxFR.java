package Recursion;

public class MaxFR {
    public static void main(String[] args) {
        String s="aabbacbd";
        int max=0;
        String[] ch=new String[2];
                ch=loopI(ch,s,0,0,'a');
        System.out.println(ch[1]);
        System.out.println(ch[0]);
    }

    private static String[] loopI(String[] ch,String s, int i, int max,char c) {
        if(i<s.length())
        {
            int count=loopJ(s,s.charAt(i),0,0);
            if(count>max)
            {
                max=count;
                c=s.charAt(i);
            }
            return loopI(ch,s,++i,max,c);
        }
        ch[0]=max+"";
        ch[1]=c+"";
        return ch;
    }

    private static int loopJ(String s, char ch, int i, int cnt)
    {
        if (i<s.length()){
            if (s.charAt(i)==ch)
                cnt++;
            return loopJ(s,ch,++i,cnt);

        }
        return cnt;

    }
}
