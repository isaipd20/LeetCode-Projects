
# 💼 Shuffle the Array<a name="about-project"></a>
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
<br>
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
<br><br>

Example 1:
<br>
Input: nums = [2,5,1,3,4,7], n = 3 <br>
Output: [2,3,5,4,1,7] <br>
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

# 📜 Plan/Problems
1. Create a new array with the size of the old array.
2. Create a loop that goes through the array.
3. If the index of the array is even, then add to the new array, add 1 to counter1.
4. If the index of the array is odd, then add to the new array, add 1 to counter2.
5. Repeat the process with all values.
6. Return new array. 


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1148447179/)
