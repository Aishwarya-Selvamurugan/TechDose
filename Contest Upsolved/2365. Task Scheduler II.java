class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        int l = tasks.length;
        Map<Integer,Long> map = new HashMap<>();
        long days = 0;
        for(int i=0;i<l;i++)
        {
            if(!(map.containsKey(tasks[i])) || days >= map.get(tasks[i]))
            {
                
                map.put(tasks[i],days+space+1);
                days++;
            }
            else
            {
                days = map.get(tasks[i]);
                map.put(tasks[i],days+space+1);
                days++;
            }
        }
        return days;
    }
}
