class Solution:
    def hamingWeight(self, n: int) -> int:
        return bin(n).count("1")