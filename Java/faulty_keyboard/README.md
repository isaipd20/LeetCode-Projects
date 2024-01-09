
# 💼 Faulty Keyboard<a name="about-project"></a>
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. <br>
Typing other characters works as expected.
<br>
You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
<br>
Return the final string that will be present on your laptop screen.
<br><br>

Example 1:
<br><br>
Input: s = "string"<br>
Output: "rtsng"<br>
Explanation: <br>
After typing first character, the text on the screen is "s".<br>
After the second character, the text is "st". <br>
After the third character, the text is "str". <br>
Since the fourth character is an 'i', the text gets reversed and becomes "rts". <br>
After the fifth character, the text is "rtsn". <br>
After the sixth character, the text is "rtsng". <br>
Therefore, we return "rtsng".

# 📜 Plan/Problems
1. Create a loop that goes through every character in the given string.
2. Put every character in a new string.
3. If the character is an 'i' then reverse that string.
4. Add that reversed string to the original string.
5. Return string.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1141875127/)
