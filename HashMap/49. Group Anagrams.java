class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int l = strs.length;
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs)
        {
            char[] f = new char[26];
            for(char c:s.toCharArray())
            {
                f[c-'a']++;
            }
            if(!map.containsKey(String.valueOf(f)))
            {
                map.put(String.valueOf(f),new ArrayList());
            }  
            map.get(String.valueOf(f)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
