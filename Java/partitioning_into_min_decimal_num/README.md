
# 💼 Partitioning Into Minimum Number Of Deci-Binary Numbers<a name="about-project"></a>
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. <br>
For example, 101 and 1100 are deci-binary, while 112 and 3001 are not. <br>
Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
<br><br>

Example 1:
<br>
Input: n = "32" <br>
Output: 3 <br>
Explanation: 10 + 11 + 11 = 32

# 📜 Plan/Problems
1. Since it is a given string, get the numberic value of the first number/character.
2. Create a loop that goes through the string characters.
3. If the numeric value of the character is greater than the current value then get that value.
4. Return the numeric value.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1147402689/)
