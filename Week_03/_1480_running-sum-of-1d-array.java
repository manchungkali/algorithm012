class Solution{
    public int[] runningSum(int[] nums){
        //for loop
        //直接在原数组上操作 累加值
        //现在下标的和 = 现在下标的值+ 前一个下标的和值
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }


}