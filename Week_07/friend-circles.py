class Solution:
    def findCircleNum(self, M: List[List[int]]) -> int:
        N = len(M)
        count = 0
        visited = set()
        
        def dfs(i):
            for j in range(N):
                if M[i][j] and j not in visited:
                    visited.add(j)
                    dfs(j)
        
        for i in range(N):
            if  i not in visited:
                count += 1
                visited.add(i)
                dfs(i)
        
        return count 

class Solution2:
    def findCircleNum(self, M: List[List[int]]) -> int:
        f = {}
        s = {}
        count = len(M)

        def find(x):
            f.setdefault(x, x)
            # 路径压缩
            if x != f[x]:
                f[x] = find(f[x])
            return f[x]

        def union(x, y):
            nonlocal count
            x_father, y_father = find(x), find(y)
            if x_father == y_father: return
            # 将小树的根节点连接到大叔的根节点
            if s.setdefault(x_father, 1) < s.setdefault(y_father, 1):
                f[x_father] = y_father
                s[y_father] += s[x_father]
            else:
                f[y_father] = x_father
                s[x_father] += s[y_father]
            count -= 1

        for i in range(len(M)):
            for j in range(i + 1, len(M)):
                if M[i][j] == 1:
                    union(i, j)
        return count

class Solution3:
    def findCircleNum(self, M) -> int:
        father = [i for i in range(len(M))]

        def find(a):
            if father[a] != a: father[a] = find(father[a])
            return father[a]

        def union(a,b):
            father[find(b)] = find(a)
            return find(b)
        for a in range(len(M)):
            for b in range(a):
                if M[a][b]: union(a,b)
        for i in range(len(M)): find(i)
        return len(set(father))
class Solution4:
    def findCircleNum(self, M) -> int:
        father = [i for i in range(len(M))]
        def find(a):
            if father[a] != a:
                father[a] = find(father[a])
            return father[a]
        def union(a,b):
            father[find(b)] = find(a)
            return find(b)
        for a in range(len(M)):
            for b in range(a):
                if M[a][b]: union(a,b)
        for i in range(len(M)): find(i)
        return len(set(father))
class Solution5:
    def finbCircleNum(self, M) -> int:
        father = [i for i in range(len(M))]
        def find(a):
            if father[a] != a:
                father[a] = father(father[a])
            return father[a]
        def union(a,b):
            father[find(b)] = find(a)
            return find(b)
        for a in range(len(M)):
            for b in range(a):
                if M[a][b]: union(a,b)
        for i in range(len(M)): find(i)
        return len(set(father))