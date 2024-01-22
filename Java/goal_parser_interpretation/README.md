
# 💼 Goal Parser Interpretation<a name="about-project"></a>
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. <br>
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". <br>
The interpreted strings are then concatenated in the original order.
<br>
Given the string command, return the Goal Parser's interpretation of command.
<br><br>

Example 1:
<br>
Input: command = "G()(al)" <br>
Output: "Goal" <br><br>
Explanation: The Goal Parser interprets the command as follows: <br>
G -> G <br>
() -> o <br>
(al) -> al <br>
The final concatenated result is "Goal".

# 📜 Plan/Problems
1. Create a loop that goes through every character.
2. If the character is '(' or ')', check next character.
3. If the character is 'a' or 'l', write al in the string.
4. If the character is '()', write 'o' in the string.
5. Return string.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1152377997/)
