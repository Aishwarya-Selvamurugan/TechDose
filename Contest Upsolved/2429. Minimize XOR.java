class Solution {
    public int minimizeXor(int num1, int num2) {
        int n1bits = nbits(num1);
        int n2bits = nbits(num2);
        if(n1bits == n2bits)
        {
            return num1;
        }
        else if(n1bits>n2bits)
        {
            int mask = 1;
            while(n1bits!=n2bits)
            {
                if((num1&mask)>0)
                {
                    num1-=mask;
                    n1bits--;
                }
                mask<<=1;
            }
        }
        else
        {
            int mask = 1;
            while(n1bits!=n2bits)
            {
                if((num1&mask)==0)
                {
                    System.out.println(mask);
                    num1+=mask;
                    n1bits++;
                }
                mask<<=1;
            }
        }
        return num1;
    }
    public static int nbits(int a)
    {
        int count = 0;
        while(a>0)
        {
            a=a&(a-1);
            count++;
        }
        return count;
    }
}
