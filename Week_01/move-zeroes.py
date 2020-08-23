class Solution:
    def moveZeros(self, nums: List[int])-> None:
        zero_num = 0
        for i in range(len(nums)):
            idx = i - zero_num
            if nums[idx] == 0:
                nums.pop(idx)
                nums.append(0)
                zero_num += 1


