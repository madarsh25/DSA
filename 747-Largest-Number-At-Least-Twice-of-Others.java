class Solution {
    public int dominantIndex(int[] nums) {
        int large = -1;
        int secLarge = -1;
        int index = -1;

        for (int num = 0; num < nums.length; num++){
            if (nums[num] >= large){
                secLarge = large;
                large = nums[num];
                index = num;
            }else if (nums[num] < large && nums[num] >= secLarge){
                secLarge = nums[num];
            }
        }

        return (large >= 2*secLarge) ? index : -1;
    }
}