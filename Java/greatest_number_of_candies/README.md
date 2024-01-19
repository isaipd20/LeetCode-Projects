
# 💼 Kids With the Greatest Number of Candies<a name="about-project"></a>
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, <br>
and an integer extraCandies, denoting the number of extra candies that you have. <br>

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, <br>
they will have the greatest number of candies among all the kids, or false otherwise. <br>
Note that multiple kids can have the greatest number of candies.
<br><br>

Example 1:
<br>
Input: candies = [2,3,5,1,3], extraCandies = 3 <br>
Output: [true,true,true,false,true] 

# 📜 Plan/Problems
1. Create a loop to find the max value of the array.
2. Store the max value of the array.
3. Create a loop that goes through all the values.
4. If the current value plus the extra candies is greater than the max value, add true to new array.
5. Else, add false to the new array.
6. Return new array.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1150457667/)
