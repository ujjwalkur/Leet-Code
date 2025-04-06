class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        partitions(0, s, path, res);

        return res;
    }

    public void partitions(int index, String s, List<String> path, List<List<String>>ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                partitions(i+1, s, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }  

    boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}