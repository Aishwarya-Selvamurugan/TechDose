class Solution {
    public int uniqueLetterString(String s) {
        int l = s.length();
        Map<Character,List<Integer>> map = new HashMap<>();
        int a[] = new int[26];
        for(int i=0;i<l;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                List<Integer> lst = map.get(s.charAt(i));
                lst.add(i);
                map.replace(s.charAt(i),lst);
                // System.out.print(lst);
            }
            else
            {
                List<Integer> lst = new ArrayList<>();
                lst.add(-1);
                lst.add(i);
                map.put(s.charAt(i),lst);
                // System.out.print(lst);
            }
            
            a[s.charAt(i)-'A']=1;
        }
        int res = 0;
        for(int i=0;i<26;i++)
        {
            if(a[i] == 1)
            {
                List<Integer> lst = map.get((char)(i+'A'));
                lst.add(l);
                for(int j=1;j<lst.size()-1;j++)
                {
                    // System.out.print(lst.get(j)+" ");
                    res += ((lst.get(j)-lst.get(j-1)) *(lst.get(j+1)-lst.get(j)));
                }
                // System.out.println();
            }
        }
        return res;
    }
}
