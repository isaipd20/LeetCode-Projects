
# 💼 Number of Laser Beams in a Bank<a name="about-project"></a>
Anti-theft security devices are activated inside a bank. You are given a 0-indexed binary string array bank representing the floor plan of the bank, <br>
which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0' means the cell is empty, <br>
while'1' means the cell has a security device.
<br><br>
There is one laser beam between any two security devices if both conditions are met:
<br>
The two devices are located on two different rows: r1 and r2, where r1 < r2.<br>
For each row i where r1 < i < r2, there are no security devices in the ith row.<br>
Laser beams are independent, i.e., one beam does not interfere nor join with another.
<br>
Return the total number of laser beams in the bank.
<br><br>

Input: bank = ["011001","000000","010100","001000"]<br>
Output: 8<br>
Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams<br>
![alt text](https://assets.leetcode.com/uploads/2021/12/24/laser1.jpg)

# 📜 Plan/Problems
1. Create a 2D loop where it will check every string in the array.
2. In each string loop to look for 1's
3. if there are ones in the loop, count them.
4. Do this for every string.
5. If first time adding the counts, add the count to the result.
6. Else, multiply the counts by the result and then sum with the last operation.
7. If there are not 1's in string, then skip.
8. Return sum of all operations.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1137972253/)
