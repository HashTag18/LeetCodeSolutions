// LeetCode Problem: Two Sum
// link: https://leetcode.com/problems/two-sum/
// 30 ms Beats 49.74%

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i=0 ; i<size ; i++){
            int current= nums[i];
            int find =target-current;
            for (int j=i+1 ; j<size ; j++){
                if(nums[j]==find){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
};