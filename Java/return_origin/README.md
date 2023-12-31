
# 💼 Robot Return Origin<a name="about-project"></a>
There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
<br>
You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
<br>
Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
<br>
Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

<br><br> 

Example 1:<br><br>

Input: moves = "UD"<br>
Output: true<br>
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.

# 📜 Plan/Problems
1. Create a loop that takes every character of the string.
2. Then we create variables that store the robot movements.
3. If the number of movements of Up & Down are the same, return true.
4. If the number of movements of Right & Left are the same, return true.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1110015135/)
