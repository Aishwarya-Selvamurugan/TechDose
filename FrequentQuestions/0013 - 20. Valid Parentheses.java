class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if(!stack.isEmpty() && ((c == ')' && stack.peek() == '(' )|| (stack.peek() == '{' && c == '}')|| (stack.peek() == '[') &&  c == ']'))
            {
                stack.pop();
            }
            else
            {
                return false;
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
