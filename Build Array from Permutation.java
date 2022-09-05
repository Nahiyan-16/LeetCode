class Solution {
    public int[] buildArray(int[] nums) {
        int[] zero = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            zero[i] = nums[nums[i]];
        }
        return zero;
    }
}
