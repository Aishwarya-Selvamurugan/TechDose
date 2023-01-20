class Solution {
    public int bitwiseComplement(int n) {
        int mask = 1;
        if(n == 0)
        {
            return 1;
        }
        while(mask <= n)
        {
            
            if((n&mask) == 0)
            {
                n = mask|n;
            }
            else
            {
                n = mask^n;
            }
            mask<<=1;
        }
        return n;
    }
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mask = 1;
		while(mask < n)
		{
		    n = n^mask;
		    mask<<=1;
		}
		System.out.println(n);
	}
}
