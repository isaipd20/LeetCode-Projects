
# 💼 Split a String in Balanced Strings<a name="about-project"></a>
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
<br>
Given a balanced string s, split it into some number of substrings such that:
<br>
Each substring is balanced.<br>
Return the maximum number of balanced strings you can obtain.
<br><br>

Example 1:
<br>
Input: s = "RLRRLLRLRL" <br>
Output: 4 <br>
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

# 📜 Plan/Problems
1. Create a loop that iterates through the given string.
2. If we have a 'R' character in the string, then we add 1 to counter.
3. If we have a 'L' character in the string, then we subtract 1 from counter.
4. If the counter reaches 0, then add 1 to result.
5. Return result.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1170410483/)
