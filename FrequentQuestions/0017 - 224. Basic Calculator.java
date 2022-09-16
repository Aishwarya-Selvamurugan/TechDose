class Solution {
    public int calculate(String s) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int l = s.length();
        int sign = 1;
        for(int i=0;i<l;i++)
        {
            int sum = 0;
            if(Character.isDigit(s.charAt(i)))
            {
                while(i<l && Character.isDigit(s.charAt(i)))
                {
                    sum = sum*10 + (s.charAt(i)-'0');
                    i++;
                }
                if(i<=l)
                {
                    i--;
                }
                res += sum*sign;
            }
            else if(s.charAt(i) == '+')
            {
                sign = 1;
            }
            else if(s.charAt(i) == '-')
            {
                sign = -1;
            }
            else if(s.charAt(i) == '(')
            {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }
            else if(s.charAt(i) == ')')
            {
                res = res * stack.pop()+stack.pop();
            
            }
        }
        return res;
    }
}
