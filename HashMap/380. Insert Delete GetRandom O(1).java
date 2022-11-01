class RandomizedSet {
    Set<Integer> set = new HashSet<>();
    List<Integer> l = new ArrayList<>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(!set.add(val))
        {
            return false;
        }
        l.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(set.contains(val))
        {
            set.remove(val);
            int index = l.indexOf(val);
            l.remove(index);
            return true;
        }
        
        return false;
    }
    
    public int getRandom() {
        int min = 0;
        int max = l.size()-1;
        int ind = (int)(Math.random()*(max-min+1));
        return l.get(ind);
    }
}
