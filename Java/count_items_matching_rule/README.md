
# 💼 Count Items Matching a Rule<a name="about-project"></a>
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
<br><br>
The ith item is said to match the rule if one of the following is true:
<br>
ruleKey == "type" and ruleValue == typei. <br>
ruleKey == "color" and ruleValue == colori. <br>
ruleKey == "name" and ruleValue == namei. <br>
Return the number of items that match the given rule.
<br><br>

Example 1:
<br>
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver" <br>
Output: 1 <br>
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

# 📜 Plan/Problems
1. Create a loop that goes for every element in the first list.
2. Depending on the key we are given is the ith element that we are going to look inside each list.
3. After matching the key value, look if the value matches with what we are looking for.
4. For every match, add 1 to the counter.
5. Return counter.

# 🛠 Created with
- Programming language: java
- Tools/Technologies: leetcode

# 💎 Submission Detail
Link: [here](https://leetcode.com/submissions/detail/1125401708/)
