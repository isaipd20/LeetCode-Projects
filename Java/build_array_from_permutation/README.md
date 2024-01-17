
# 💼 Build Array from Permutation<a name="about-project"></a>
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
<br>
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
<br><br>

Example 1:
<br>
Input: nums = [0,2,1,5,3,4] <br>
Output: [0,1,2,4,5,3] <br>
Explanation: The array ans is built as follows: <br>
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]] <br>
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]] <br>
    = [0,1,2,4,5,3]

# 📜 Plan/Problems
1. Create a loop that iterates through the given array.
2. Store the values in index ith of a new array.
3. The values stored will be the ith of the ith in the old array.
4. Return new array.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1148382787/)
