# 给定一个整数数组 nums 和一个目标值 target，
# 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
# 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。  
# 示例:
# 给定 nums = [2, 7, 11, 15], target = 9
# 因为 nums[0] + nums[1] = 2 + 7 = 9
# 所以返回 [0, 1]
class Solution:
    def twoSum(self, nums:List[int], target: int)-> int:
        #定义字典用来存 target - nums[i]
        #for 将nums的index与值互换
        #for 遍历比较是否存在字典中 存在则 不存在则
        h = {}
        for x,num in enumerate(nums):
            h[num] = x
        for y,num in enumerate(nums):
            z = h.get(target - num)
            if z and y != z:
                return [y,z]
        








class Solution:
    def twoSum(self, nums:List[int], target: int) -> List[int]:
        h = {}
        for x, num in enumerate(nums):
            h[num] = x 
        for i, num in enumerate(nums):
            j = h.get(target - num)
            if j and i != j:
                return[i,j]
