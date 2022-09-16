class Solution {
    public String minRemoveToMakeValid(String s) {
        int l = s.length();
        int open = 0;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i) == '(')
            {
                open++;
            }
            else if(s.charAt(i) == ')')
            {
                if(open == 0){
                continue;
                }
                open--;
            }
            sb.append(s.charAt(i));
        }
        StringBuilder sb1 = new StringBuilder();
        l = sb.length();
        for(int i=l-1;i>=0;i--)
        {
            if(sb.charAt(i) == '(' && open-- > 0)
            {
                continue;
            }
            sb1.append(sb.charAt(i));
        }
        return sb1.reverse().toString();
    }
}
