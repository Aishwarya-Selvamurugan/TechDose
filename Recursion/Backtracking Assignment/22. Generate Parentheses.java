class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        Valid(n,0,0,"");
        return res;
    }
    public void Valid(int n,int o,int e,String s)
    {
        if(s.length() == n*2)
        {
            res.add(s);
            return;
        }
        if(o < n)
        {
            Valid(n,o+1,e,s+"(");
        }
        if(e < o)
        {
            Valid(n,o,e+1,s+")");
        }
    }
}
