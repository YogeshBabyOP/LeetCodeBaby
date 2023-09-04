Credits : https://leetcode.com/

Problem Statement : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
  
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Brute Force Solution :

class Solution {
    public int[] twoSum(int[] nums, int target) {
      
            int[] ans = new int[2];
      
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[j] == target) {
                            ans[0] = i;
                            ans[1] = j;
                        }
                    }
                }
                return Yogesh;
          }
    }

Optimal Solution :

Algorithm : 

1. Create a HashMap of Integer type.
2. Traverse the array and check for required target in the HashMap.
3. If you got target - nums[i] it means target = nums[i] + nums[j];
4. If not present in HashMap add to it along with its index.
5. If you got nothing from HashMap just return {-1, -1} (you need to return something at the end).

class Solution {
    public int[] twoSum(int[] nums, int target) {
            
        HashMap<Integer, Integer> map = new HashMap <>();

        for (int i = 0; i < nums.length; i++) {
            int requiredTarget = target - nums[i];
            if (map.containsKey (requiredTarget)) {
                return new int[] {map.get (requiredTarget), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return  new int[] {-1, -1};
    }
}
