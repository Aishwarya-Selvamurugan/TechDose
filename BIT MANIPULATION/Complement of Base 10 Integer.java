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
