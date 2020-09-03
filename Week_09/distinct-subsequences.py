class Solution:
    def numDistinct(self, s: str, t: str) -> int:
        N1 = len(s)
        N2 = len(t)
        if N1 < N2:
            return 0
        count = collections.defaultdict(list)
        for i, c in enumerate(t):
            count[c].append(i)
        status = [1] + [0] * N2
        for ch in s:
            for j in count[ch][::-1]:
                status[j + 1] += status[j]
        return status[-1]