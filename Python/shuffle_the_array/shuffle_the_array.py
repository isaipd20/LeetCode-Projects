class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        result = []
        count = n
        temp = 0

        for x in range(len(nums)):
            if x % 2 == 0:
                result.append(nums[temp])
                temp = temp + 1
            else:
                result.append(nums[count])
                count = count + 1

        return result