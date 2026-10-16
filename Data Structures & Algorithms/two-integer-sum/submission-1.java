class Solution {
    public int[] twoSum(int[] nums, int target) {

        int k = 0;
        while (true){
            for (int i=0; i<nums.length; i++){
                if(k==i){
                    continue;
                } else if ((nums[k]+nums[i]) == target ){
                    if(i<k){
                        return new int[] {i,k};
                    } else {
                        return new int[] {k,i};
                    }
                }
            }
            k++;
        }

    }
}