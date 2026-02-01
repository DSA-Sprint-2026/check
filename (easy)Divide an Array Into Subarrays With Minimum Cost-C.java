class Solution {
    public int minimumCost(int[] nums) {
        int cost = nums[0];
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < n; i++) {
            pq.offer(nums[i]);
        }
        return cost + pq.poll() + pq.poll();
    }
}
