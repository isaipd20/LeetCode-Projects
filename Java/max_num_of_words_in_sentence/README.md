
# 💼 Maximum Number of Words Found in Sentences<a name="about-project"></a>
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
<br>
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
<br>
Return the maximum number of words that appear in a single sentence.
<br><br>

Example 1:
<br>
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]<br>
Output: 6

# 📜 Plan/Problems
1. Create a loop to iterate through all strings of the array.
2. Create a second loop to iterate through every character of the string.
3. We initialize a new array with all values equal to one.
4. If there is a space in the string then we add to those values in the new array.
5. If the current number of value is greater than the last one, then keep current num.
6. Return max number.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1120798448/)
