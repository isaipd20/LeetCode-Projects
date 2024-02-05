
# 💼 Count Pairs Whose Sum is Less than Target<a name="about-project"></a>
Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
<br><br>

Example 1:
<br>
Input: nums = [-1,1,2,3,1], target = 2<br>
Output: 3<br><br>
Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:<br>
- (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target<br>
- (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target <br>
- (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target<br>
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.

# 📜 Plan/Problems
1. Create a double loop that iterates through the first 2 values of the array.
2. If the values of the array are less than target, then add 1 to sum.
3. Repeat process.
4. Return sum.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1159831421/)
