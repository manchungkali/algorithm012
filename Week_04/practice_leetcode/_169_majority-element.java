// class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 1;
//         int cand_num = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             if (cand_num == nums[i]) {
//                 ++count;
//             }else if (--count == 0 ) {
//                 cand_num = nums[i];
//                 count = 1;
//             }
//         }
//         return cand_num;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        //定义比较数值 指针
        int cand_num = nums[0];
        //定义计数
        int count = 1;
        //for  int i=1,
         //循环数组长度 
        //判断第一个与第二数是否相等
        //不等则判断计数变量是否为零
        // 则 将第二个数赋值给第一数，重置计数器count
        //最后返回重复数字最多的那个值
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i]) {
                ++count;
            }else if (--count == 0) {
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;
       
    }
}