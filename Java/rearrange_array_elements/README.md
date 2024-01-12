
# 💼 Rearrange Array Elements by Sign<a name="about-project"></a>
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
<br>
You should rearrange the elements of nums such that the modified array follows the given conditions:
<br>
Every consecutive pair of integers have opposite signs. <br>
For all integers with the same sign, the order in which they were present in nums is preserved. <br>
The rearranged array begins with a positive integer. <br>
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
<br><br>

Example 1: <br>

Input: nums = [3,1,-2,-5,2,-4] <br>
Output: [3,-2,1,-5,2,-4]

# 📜 Plan/Problems
1. Create 2 arraylists, 1 for negative numbers and the other for positive num.
2. Create a loop that goes through the given array.
3. Sort the numbers in the 2 arraylists.
4. Create a new loop that will combine the 2 arraylists.
5. Store a positive num first, then a negative.
6. Return new array.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1143037451/)
