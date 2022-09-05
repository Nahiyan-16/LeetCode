class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ary = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i = i + 2){
            ary[i] = nums[count];
            ary[i+1] = nums[n+count];
            count += 1;
        }
        return ary;
    }
}
