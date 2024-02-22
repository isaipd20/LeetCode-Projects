
# 💼 Check if a String Is an Acronym of Words<a name="about-project"></a>
Given an array of strings words and a string s, determine if s is an acronym of words.
<br>
The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order.<br>
For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].<br>

Return true if s is an acronym of words, and false otherwise.
<br><br>

Example 1:
<br>
Input: words = ["alice","bob","charlie"], s = "abc" <br>
Output: true

# 📜 Plan/Problems
1. Create a loop that goes through the given list of strings.
2. Get the first letter of every word in the list.
3. Add that letter to the result.
4. If the result is equal to the given target, then return true.
5. Else, return false.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1180688119/)
