Credits : https://leetcode.com

problem statement : Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity. // by seeing time complexity, you have to understand it was a Binary Search Problem.

Sample Test Cases : 
  
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
  
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
  
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Navie Solution : 
TC --> O(N)
SC --> O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {

        // if target found answer will be index,
        // as we know it was sorted, so if very first greater element will be ne next element to target,
        // so return that index.
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {      
                return i;
            }
        }
        return nums.length; // if target not found, new element must be at last of the array.
    }
}


Optimal Solution : 

Algorithm : 

Binary Search : (for better understanding please visit my previous Binary Search problem :)
TC --> O(log N)
SC --> O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[mid] > target) {
                end = mid - 1;
            }
            
            if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return start;
    }
}
