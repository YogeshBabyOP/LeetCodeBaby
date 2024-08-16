# 624. Maximum Distance in Arrays 

(https://leetcode.com/problems/maximum-distance-in-arrays/)


### You are given m arrays, where each array is sorted in ascending order.

### You can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a - b|.

### Return the maximum distance.

---------------------------------------------------------------------------------------------------
> Example 1:

        Input: arrays = [[1,2,3],[4,5],[1,2,3]]
        Output: 4
        Explanation: One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.
        Example 2:
        
        Input: arrays = [[1],[1]]
        Output: 0

> Example 2:
        
        Input: arrays = [[1],[1]]
        Output: 0

Constraints:

        m == arrays.length
        2 <= m <= 105
        1 <= arrays[i].length <= 500
        -104 <= arrays[i][j] <= 104
        arrays[i] is sorted in ascending order.
        There will be at most 105 integers in all the arrays.

### Solution java :

        class Solution {
            public int maxDistance(List<List<Integer>> arrays) {
                
                int maxDist = Integer.MIN_VALUE;
             
                int min = arrays.get(0).get(0);
                int max = arrays.get(0).get(arrays.get(0).size() - 1);
        
                for (int i = 1; i < arrays.size(); i++) {
                    
                    List<Integer> list = arrays.get(i);
        
                    int currentMin = list.get(0);
                    int currentMax = list.get(list.size() - 1);
        
                    maxDist = Math.max(maxDist, Math.abs(currentMax - min));
                    maxDist = Math.max(maxDist, Math.abs(currentMin - max));
        
                    min = Math.min (min, currentMin);
                    max = Math.max(max, currentMax);
                }
                return maxDist;
            }
        }