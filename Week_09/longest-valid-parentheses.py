class Solution:
    def longestValidParentheses(self, s: str) -> int:
        if not s: return 0
        stack = []
        ans = 0
        for i in range(len(s)):
            if not stack or s[i] == '(' or s[stack[-1]] == ')':
                stack.append(i)
            else:
                stack.pop()
                ans = max(ans, i - (stack[-1] if stack else -1))
        return ans