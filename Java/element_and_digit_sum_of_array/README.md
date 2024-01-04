
# 💼 Difference Between Element Sum and Digit Sum of an Array<a name="about-project"></a>
You are given a positive integer array nums.
<br>
The element sum is the sum of all the elements in nums. <br>
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums. <br>
Return the absolute difference between the element sum and digit sum of nums.<br>

Note that the absolute difference between two integers x and y is defined as |x - y|.
<br><br>

Example 1:
<br>
Input: nums = [1,15,6,3] <br>
Output: 9 <br><br>
Explanation:  <br>
The element sum of nums is 1 + 15 + 6 + 3 = 25. <br>
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16. <br>
The absolute difference between the element sum and digit sum is |25 - 16| = 9.

# 📜 Plan/Problems
1. Create 2 loops.
2. The first loop will add all nums in the array.
3. The second loop will add all nums in the array except greater than 10.
4. All numbers greater than 10 will be split in two separated numbers.
5. Then add those to the sum.
6. Get the absolute value of the subtraction of the two additions.
7. Return value.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1136268146/)
