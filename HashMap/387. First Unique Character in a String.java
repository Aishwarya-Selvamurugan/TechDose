class Solution {
    public int firstUniqChar(String s) {
        int l = s.length();
        int a[] = new int[26];
        for(int i=0;i<l;i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<l;i++)
        {
            if(a[s.charAt(i)-'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
