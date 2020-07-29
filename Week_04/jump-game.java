class Solution {
    public boolean canJump(int nums[]) {
        if (nums == null || nums.length == 0) return false;
        //定义赋值终点下标
        int top = nums.length - 1 ;
        //for loop
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= top) top = i;
        }
        return top == 0;
    }

}