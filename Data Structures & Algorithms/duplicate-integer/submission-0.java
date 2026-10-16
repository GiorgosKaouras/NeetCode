class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set <Integer> seen = new HashSet<>();

        for (int n: nums){
            seen.add(n);
        }
        
        return seen.size() == nums.length ? false : true;
    }
}