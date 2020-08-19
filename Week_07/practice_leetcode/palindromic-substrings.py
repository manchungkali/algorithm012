#中间扩散
class Solution:
    def countSubstrings(self, s : str) -> int:
        def check(s, l, r):
            num = 0
            while l >= 0 and r < len(s) and s[l] == s[r]:
                l -= 1
                r += 1
                num += 1
            return num
        num = 0
        for i in range(len(s)):
            num += check(s, i, i)
            if i == len(s) - 1
                continue
            num += check(s,i,i+1)
        return num
