
# 💼 Find the Highest Altitude<a name="about-project"></a>
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. <br>
The biker starts his trip on point 0 with altitude equal 0. <br>

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). <br>
Return the highest altitude of a point.
<br><br>

Example 1:
<br>
Input: gain = [-5,1,5,0,-7]<br>
Output: 1<br>
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

# 📜 Plan/Problems
1. Create a loop that goes through the given array.
2. Add the current number plus the next one.
3. If the sum is greater that the current sum, then pass it to the result.
4. Return result.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1183657197/)
