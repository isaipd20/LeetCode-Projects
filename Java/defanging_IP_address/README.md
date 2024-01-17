
# 💼 Defanging an IP Address<a name="about-project"></a>
Given a valid (IPv4) IP address, return a defanged version of that IP address.
<br>
A defanged IP address replaces every period "." with "[.]".
<br><br>

Example 1:
<br>
Input: address = "1.1.1.1" <br>
Output: "1[.]1[.]1[.]1"

# 📜 Plan/Problems
1. Create a loop that iterates through the given array.
2. If the character in the ith element is a dot, then a add [] to bot sides.
3. Else, add the characters to a new string.
4. Return new string.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1148391939/)
