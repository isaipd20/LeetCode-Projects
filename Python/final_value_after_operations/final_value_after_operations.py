class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        count = 0

        for x in operations:
            if "X++" in x or "++X" in x:
                count = count + 1
            else:
                count = count - 1

        return count
        