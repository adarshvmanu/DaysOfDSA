import numpy
class Solution(object):
    def containsDuplicate(self, nums):
        x=numpy.array(nums)
        y=numpy.unique(x)
        if(len(nums)>len(y)):
            return True
        return False