class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int k=0; k<nums.length; k++){
            for (int i=(k +1); i<nums.length; i++){
                if ((nums[k]+nums[i]) == target ){
                   return new int[] {k,i};
                }
            }
        }
        return new int[] {};
    }
}