class Solution {
    public void helper(int[] arr,int i,int sum,int target, List<List<Integer>>list,List<Integer>ans){
        if(sum==target){
            list.add(new ArrayList<>(ans));
            return ;
        }
        if(sum>target){
            return ;
        }
       while(i<arr.length){
            ans.add(arr[i]);
            helper(arr,i,sum+arr[i],target,list,ans);
            ans.remove(ans.size()-1);
            i++;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        helper(candidates,0,0,target,list,ans);
return list;
    }
}