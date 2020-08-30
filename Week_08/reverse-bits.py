class Solution:
    def reverseBits(self, n: int) -> int:
        str1 = bin(n)
        str2 = str1[2:].zfill(32)
        str3 = str[::-1]
        return int(str3,2)