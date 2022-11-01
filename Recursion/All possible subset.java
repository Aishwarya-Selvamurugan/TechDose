import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        all_possible_subset(s,0," ");

    }
    public static void all_possible_subset(char[] s,int l,String curr)
    {
        if(l == s.length)
        {
            System.out.println(curr);
            return;
        }
        all_possible_subset(s,l+1,curr);
        all_possible_subset(s,l+1,curr+s[l]);
    }
}
