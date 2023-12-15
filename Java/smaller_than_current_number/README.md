# 💼 How Many Numbers Are Smaller Than the Current Number<a name="about-project"></a>
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. <br>
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
<br>
Return the answer in an array.
<br><br>

Example 1:
<br>
Input: nums = [8,1,2,2,3]<br>
Output: [4,0,1,1,3]

# 📜 Plan/Problems
1. Create a loop to iterate through the array of numbers.
2. Create a second loop to iterate through the same array.
3. If the number of the second array is smaller than the first one, add one to position of new array.
4. Return new array.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1120070154/)
