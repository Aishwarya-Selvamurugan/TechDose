class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l1 = s.length();
        int l2 = p.length();
        List<Integer> list = new ArrayList<>();
        if(l1 < l2 || l2 == 0)
        {
            return list;
        }
        int[] fp = new int[26];
        int[] fs = new int[26];
        Arrays.fill(fp,0);
        for(char ch:p.toCharArray())
        {
            fp[ch-'a']++;
        }
        Arrays.fill(fs,0);
        int right = 0,left = 0,count;
        while(right <= l1-l2)
        {
            count = l2;
            for(int i=left;count!=0;i++)
            {
                fs[s.charAt(i)-'a']++;
                right++;count--;
            }
            if(Arrays.equals(fs,fp))
            {
                list.add(left);
            }
            left++;
            right = left;
            Arrays.fill(fs,0);
        }
        return list;
    }
}
