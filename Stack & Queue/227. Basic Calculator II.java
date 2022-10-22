class Solution {
    public int calculate(String s) {
        Stack<Integer> s1 = new Stack<>();
        int l = s.length();
        int sign = 1;
        int op = 0;
        for(int i=0;i<l;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int sum = 0;
                while(i<l && Character.isDigit(s.charAt(i)))
                {
                    sum = (sum*10)+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(op == 1)
                {
                    int res = s1.pop()/sum;
                    s1.push(res);
                    op=0;
                }
                else if(op == 2)
                {
                    int res = s1.pop()*sum;
                    s1.push(res);
                    op=0;
                }
                else{
                s1.push(sum*sign);
                }
            }
            else if(s.charAt(i) == '-')
            {
                sign = -1;
            }
            else if(s.charAt(i) == '+')
            {
                sign = 1;
            }
            else if(s.charAt(i) == '/')
            {
                op = 1;
            }
            else if(s.charAt(i) == '*')
            {
                op = 2;
            }
        }
        int res = 0;
        while(!s1.isEmpty())
        {
            res += (s1.pop());
        }
        return res;
    }
}
