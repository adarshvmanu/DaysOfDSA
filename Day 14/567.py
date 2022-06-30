class Solution(object):
    def checkInclusion(self, s1, s2):
        f1 = Counter(s1)
        l1 = len(s1)
        for i in range(len(s2) - (l1 - 1)):
            if f1 == Counter(s2[i : i + l1]):
                return True
        return False   