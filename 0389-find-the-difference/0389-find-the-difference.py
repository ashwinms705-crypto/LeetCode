class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        l1=list(s)
        l2=list(t)
        l1.sort()
        l2.sort()
        for i in range(len(l1)):
            if(l1[i]!=l2[i]):
                return l2[i]
        return l2[-1]
