class Solution {
    public String smallestNumber(String pattern) {
        int l = pattern.length();
        StringBuilder sb = new StringBuilder();
        int curr = 1;
        for(int i=0;i<=l;i++)
        {
            while(i < l && pattern.charAt(i) == 'I')
            {
                sb.append(curr++);
                i++;
            }
            // System.out.println(sb.toString());
            Stack<Integer> s = new Stack<>();
            s.push(curr++);
            while(i < l && pattern.charAt(i) == 'D')
            {
                s.push(curr++);
                i++;
            }
            while(!s.isEmpty())
            {
                sb.append(s.pop());
            }
            // System.out.println(sb.toString());
        }
        return sb.toString();
    }
}
