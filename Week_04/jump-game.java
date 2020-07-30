class Solution {
    public boolean canJump(int nums[]) {
        if (nums == null || nums.length == 0) return false;
        //定义赋值终点下标
        int top = nums.length - 1 ;
        //for loop
        //终点前一个下标
        //跳出条件为 i为负数时
        //i--
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= top) top = i;
        }
        return top == 0;
    }

}