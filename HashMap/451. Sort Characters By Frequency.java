class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        for(char c:map.keySet())
        {
            maxheap.offer(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!maxheap.isEmpty())
        {
            char c = maxheap.poll();
            int f = map.get(c);
            for(int i=0;i<f;i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
