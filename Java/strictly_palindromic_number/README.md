
# 💼 Strictly Palindromic Number<a name="about-project"></a>
An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.
<br>
Given an integer n, return true if n is strictly palindromic and false otherwise.
<br>
A string is palindromic if it reads the same forward and backward.
<br><br>

Example 1:
<br>
Input: n = 9 <br>
Output: false

# 📜 Plan/Problems
1. Create a loop of size of the given int.
2. Get the new ith base string equivalent to the given base of the int.
3. Reverse that string, and compare it with the old string.
4. If they are equal then add to the count.
5. Reset variables and increase the base to get a new string.
6. If the count has the same number as the given int, then return true.
7. Else, return false, all bases are not palindromatic.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1129383962/)
