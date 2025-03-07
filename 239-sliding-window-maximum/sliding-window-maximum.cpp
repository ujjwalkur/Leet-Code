class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();

        deque<int>dq;
        vector<int>result;

        for (int i=0; i<n; i++) {
            while (!dq.empty() && dq.front() <= i-k) {
                dq.pop_front();
            }
            //maintaining the monotonic decreasing property of dq
            while (!dq.empty() && nums[i] > nums[dq.back()]) {
                dq.pop_back();
            }
            //push index in dq
            dq.push_back(i);
            //storing max element of dq.front() at result
            if(i >= k-1) {
                result.push_back(nums[dq.front()]);
            }
        }
        return result;
    }
};