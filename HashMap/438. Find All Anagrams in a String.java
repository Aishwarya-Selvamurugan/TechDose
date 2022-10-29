class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int h[] = new int[26];
        for(char c:p.toCharArray())
        {
            h[c-'a']++;
        }
        for(int l=0,r=0;r<s.length();r++)
        {
            char c = s.charAt(r);
            h[c-'a']--;
            while(h[c-'a'] < 0)
            {
                h[s.charAt(l)-'a']++;
                l++;
            }
            if(r-l+1 == p.length())
            {
                res.add(l);
            }
        }
        return res;
    }
}
