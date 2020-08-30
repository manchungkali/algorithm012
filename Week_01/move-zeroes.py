class Solution:
    def moveZeros(self, nums: List[int])-> None:
        zero_num = 0
        for i in range(len(nums)):
            idx = i - zero_num
            if nums[idx] == 0:
                nums.pop(idx)
                nums.append(0)
                zero_num += 1

#移动零
# 将零移动到非零值后面，并保持相对顺序
class Solution:
    def moveZeros(self, nums: List[int]) -> None:
        zero_num = 0
        for i in range(len(nums)):
            idx = i - zero_num
            if nums[idx] == 0:
                nums.pop(idx)
                nums.append(0)
                zero_num += 1


