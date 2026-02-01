class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int currReach = 0;
        if(nums[0] == 0 && nums.length > 1){
            return false;
        }
        for(int i = 0; i < nums.length; i++){
            maxReach = Math.max(maxReach, i + nums[i]);

            if(maxReach >= nums.length-1){
                return true;
            }
            if(currReach == i){
                if(maxReach == i){
                    return false;
                }
                else{
                    currReach = maxReach;
                }
            }
        }
        return false;
    }
}
