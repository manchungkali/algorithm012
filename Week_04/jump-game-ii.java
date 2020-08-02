class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int end = 0;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            k = Math.max(k ,i + nums[i]);
            if (i == end) {
                step++;
                end = k;
            }
        }
        return step;
    }
}