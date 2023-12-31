Credits : https://leetcode.com

problem statement : Given an array of integers nums which is sorted in ascending order, and an integer target, 
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity. // here O(log n) tells you directly it was a Binary Search Problem.


Sample Test Cases : 

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4 
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

Navie Solution : 

TC --> O(N)

SC --> O(1)

    class Solution {
        public int search(int[] nums, int target) {
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i; // target found.
                }
            }
            return -1; // if targest doesn't exit, just return -1;
        }
    }

Optimal Solution : 

Algorithm : Binary Search :)

TC --> O(log N)

SC --> O(1)

    class Solution {
        public int search(int[] nums, int target) {
            
            int start = 0;
            int end = nums.length - 1; 
        
            while (start <= end) {
                
                int mid = start + (end - start) / 2;
                
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }

## Binary Search in depth explantion with pictures.


![Screenshot (211)](https://github.com/YogeshBabyOP/LeetCodeBaby/assets/114099821/6ccf918a-dd54-4bef-99b9-778b1c7ce4c8)

![image](https://github.com/YogeshBabyOP/LeetCodeBaby/assets/114099821/acb8ba48-3334-48a5-9fc4-5d4c8797a75f)

