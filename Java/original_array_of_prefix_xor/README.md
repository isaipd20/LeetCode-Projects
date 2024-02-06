
# 💼 Find The Original Array of Prefix Xor<a name="about-project"></a>
You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
<br>
pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]. <br>
Note that ^ denotes the bitwise-xor operation. <br>

It can be proven that the answer is unique.
<br><br>

Example 1:
<br>
Input: pref = [5,2,0,3,1]<br>
Output: [5,7,2,3,2]

# 📜 Plan/Problems
1. Create a loop that goes through every int in the array.
2. If we start the array, then add the value to new array.
3. Else, we use previous value and use xor for the current value.
4. Add those values to new array.
5. Return array.


# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1158178010/)
