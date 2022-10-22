class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                s1.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && (s1.isEmpty() || s1.pop() != '('))
            {
                return false;
            }
            else if(s.charAt(i) == '}' && (s1.isEmpty() || s1.pop() != '{'))
            {
                return false;
            }
            else if(s.charAt(i) == ']' && (s1.isEmpty() || s1.pop() != '[' ))
            {
                return false;
            }
        }
        return s1.isEmpty();
    }
}
