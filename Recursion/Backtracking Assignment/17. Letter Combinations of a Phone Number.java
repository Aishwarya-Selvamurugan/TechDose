class Solution {
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0)
        {
            return res;
        }
        Combination(digits,0,digits.length(),"",res);
        return res;
    }
    public static void Combination(String digits,int start,int n,String s,List<String> res)
    {
        if(start == n)
        {
            res.add(s);
            // System.out.println(s);
            return;
        }
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int j=0;j<mapping[digits.charAt(start)-'0'].length();j++)
        {
            Combination(digits,start+1,n,s+""+mapping[digits.charAt(start)-'0'].charAt(j),res);
        }
    }
}
