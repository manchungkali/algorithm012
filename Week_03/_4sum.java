import java.util.ArrayList;
import java.util.Arrays;

class Solution{
    public List<List<Integer>> fourSum(int[] nums ,int target) {
        List<List<Integer>> list = new ArrayList<>();
        if ( nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        int len = nums.length;
        for (int a = 0; a < len - 3; a++) {
            if (a > 0 && nums[a] == nums[a-1] ) continue;
            int min = nums[a] + nums[a+1] + nums[a+2] + nums[a+3];
            if (min > target) continue;
            int max = nums[len-1] + nums[len-2] + nums[len-3] + nums[len-4];
            if( max < target) continue;
            for (int b = a + 1;b < len -2;b++) {
                if (b > a + 1 && nums[b] == nums[b-1]) continue;
                int c = b + 1;
                int d = len - 1;
                int min1 = nums[a] + nums[b] + nums[c] + nums[c+1];
                if (min1 > target) continue;
                int max1 = nums[a] + nums[b] + nums[d -1] + nums[d];
                if(max1 < target) continue;
                while (c < d) {
                    int cur = nums[a] + nums[b] + nums[c] + nums[d];
                    if (cur == target) {
                        list.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        d--;
                        while (c < d && nums[c] == nums[c - 1]) {
                            c++;
                        }
                        while (c < d && nums[d] == nums[d + 1]) {
                            d--;
                        }
                    } else if (cur > target) {
                        d--;
                    } else {
                        c++;
                    }

                }

            }

        }
        return list;
    }
}