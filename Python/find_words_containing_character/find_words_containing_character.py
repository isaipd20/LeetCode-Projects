class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        count = 0
        result = []

        for word in words:
            if x in word:
                result.append(count)
            count = count + 1

        return result