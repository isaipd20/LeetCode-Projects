
# 💼 Final Value of Variable After Performing Operations<a name="about-project"></a>
There is a programming language with only four operations and one variable X:
<br>
++X and X++ increments the value of the variable X by 1.<br>
--X and X-- decrements the value of the variable X by 1.<br>
Initially, the value of X is 0.<br>

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
<br><br>
 
Example 1:<br>

Input: operations = ["--X","X++","X++"]<br>
Output: 1

# 📜 Plan/Problems
1. Create a loop where it goes through all the values in the array.
2. Create a second loop that takes every element in each value.
3. If the element has a '+' then add to the total sum.
4. If the element has a '-' then subtract to the total sum.
5. Return total sum.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1115405377/)
