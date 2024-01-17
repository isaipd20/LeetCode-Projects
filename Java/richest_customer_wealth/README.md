
# 💼 Richest Customer Wealth<a name="about-project"></a>
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. <br>
Return the wealth that the richest customer has. <br>

A customer's wealth is the amount of money they have in all their bank accounts. <br>
The richest customer is the customer that has the maximum wealth.
<br><br>

Example 1: <br>

Input: accounts = [[1,2,3],[3,2,1]] <br>
Output: 6

# 📜 Plan/Problems
1. Create a double loop.
2. Add all the values in the row.
3. If there are more rows, add them.
4. If the sum of the row is greater than the old row, set that as higher value.
5. Return max value found in the rows. 

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1149232778/)
