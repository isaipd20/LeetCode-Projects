class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        count = 0
        result = 0

        for x in accounts:
            count = sum(x)
            if count >= result:
                result = count

        return result