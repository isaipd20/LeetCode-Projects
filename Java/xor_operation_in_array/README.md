
# 💼 XOR Operation in an Array<a name="about-project"></a>
You are given an integer n and an integer start.
<br>
Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
<br>
Return the bitwise XOR of all elements of nums.
<br><br>

Example 1:
<br>
Input: n = 5, start = 0<br>
Output: 8<br>
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.<br>
Where "^" corresponds to bitwise XOR operator.

# 📜 Plan/Problems
1. Create a first loop to do the above operation for every item.
2. Later, store those values in a new array.
3. Create a second loop that does the xor operation for every item in new array.
4. Store those values in result array.
5. Return result array.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1176745260/)
