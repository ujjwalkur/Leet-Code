class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subset = new ArrayList();
        generateSubset(1, n, new ArrayList(), subset, k);
        return subset;
    }
    
    public void generateSubset(int start, int n, List<Integer> current,List<List<Integer>> subset, int k){
        if(current.size() == k){
            subset.add(new ArrayList(current));
            return;
        }
        for(int i=start; i<=n; i++){
            current.add(i);
            generateSubset(i+1, n, current, subset, k);
            current.remove(current.size()-1);
        }
    }
}