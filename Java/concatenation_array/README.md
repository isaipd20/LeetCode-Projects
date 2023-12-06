
# 💼 Concatenation of Array<a name="about-project"></a>
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
<br>
Specifically, ans is the concatenation of two nums arrays.
<br>
Return the array ans.
<br><br>
Example 1:
<br>
Input: nums = [1,2,1]<br>
Output: [1,2,1,1,2,1]

# 📜 Plan/Problems
1. Create a loop of size of the new array.
2. Create a variable to count the position of the old array.
3. If the count reaches the old size of the array the position to 0.
4. Else keep storing the values in new array.
5. Return array.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1113298406/)
