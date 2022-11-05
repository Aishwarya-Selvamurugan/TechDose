class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        dfs(s,wordDict,0,res);
        return ans;
    }
    public void dfs(String s,List<String> wordDict,int start,List<String> res)
    {
        for(int i=start+1;i<=s.length();i++)
        {
            String S = s.substring(start,i);
            if(wordDict.contains(S))
            {
                res.add(S);
                // System.out.println(S);
                if(i == s.length())
            {
                String[] str = res.toArray(String[]::new);
                ans.add(String.join(" ",str));
            }
            else
            {
                dfs(s,wordDict,i,res);
            }
            res.remove(res.size()-1);
            }
        }
    }
}
