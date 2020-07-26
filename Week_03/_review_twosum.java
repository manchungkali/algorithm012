//Solution
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

class Solution2{
    public static int[] twoSum(int[] nums, int target) {
        //定义整型的两个数的哈希表
        Map<Integer, Integer> map = new HashMap<>();
        //for loop 
        for (int i = 0; i <nums.length; i++ ) {
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
        

    }
    public static void main(String[] args){
        int one[] = new int[] {1,2,3,4};
        int res [] = twoSum(one,7);    
        System.out.println(Arrays.toString(res));

    }


}