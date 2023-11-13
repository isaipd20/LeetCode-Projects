
# 💼 Length of last word<a name="about-project"></a>
Given a string s consisting of words and spaces, return the length of the last word in the string.
<br>
A word is a maximal substring consisting of non-space characters only.
<br><br>
Example:
<br>
Hello World
Length of last word: 5

# 📜 Plan/Problems
1. Create a loop to iterate through all characters in the string.
2. When the current position is a character we add to the count.
3. If it is a whitespace we reset the count.
4. If we reach a whitespace, we lock the last count if there are not more words.
5. IF there are more words then we remove the lock and start counting again.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1097593267/)
