class Solution {
    public int calculate(String s) {
        Stack<Integer> s1 = new Stack<>();
        
        int l = s.length();
        int sign = 1;
        int res = 0;
        for(int i=0;i<l;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int sum = 0;
                int t = 0;
                while(i<l && Character.isDigit(s.charAt(i)))
                {
                    sum = (sum*10)+(s.charAt(i)-'0');
                    i++;
                    t=1;
                }
                if(t==1)
                {
                    i--;
                }
                sum = sum*sign;
                // System.out.println(sum);
                res += sum;
            }
            else if(s.charAt(i) == '+')
            {
                sign=1;
            }
            else if(s.charAt(i) == '-')
            {
                sign = -1;
            }
            else if(s.charAt(i)== '(')
            {
                s1.push(res);
                res = 0;
                s1.push(sign);
                sign = 1;
            }
            else if(s.charAt(i) == ')')
            {
                res = res*(s1.pop())+s1.pop();
            }
        }
        
        while(s1.size()>1)
        {
            System.out.println(s1.pop());
        }
        return res;
    }
}
