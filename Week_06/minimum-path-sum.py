class Solution:
    def minPathSum(self, grid: [[int]]) -> int:
        #for 外面一层
        for m in range(len(grid)):
        #for 里面一层循环
            for n in range(len(grid[0])):
                #判断
                if m == n == 0: continue
                elif m == 0: grid[m][n] = grid[m][n-1] + grid[m][n]
                elif n == 0: grid[m][n] = grid[m-1][n] + grid[m][n]
                else: grid[m][n] = min(grid[m-1][n], grid[m][n-1]) + grid[m][n]
        return grid[-1][-1]