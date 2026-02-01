class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int result = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++){
            max = Math.max(max + nums[i], nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
