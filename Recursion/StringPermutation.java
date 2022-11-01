import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        string_Permutation(s,0,s.length-1);
    }
    public static void string_Permutation(char[] s,int l,int r)
    {
        if(l==r)
        {
            System.out.println(s);
            return ;
        }
        for(int i=l;i<=r;i++)
        {
            swap(s,l,i);
            string_Permutation(s,l+1,r);
            swap(s,l,i);
        }
    }
    public static void swap(char[] s,int l,int r)
    {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}
