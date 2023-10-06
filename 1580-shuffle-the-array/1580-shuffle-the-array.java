class Solution {
    public int[] shuffle(int[] nums, int n) {

        
        int[] temp = new int[nums.length];
         int x = 0;
        for(int i = 0 ; i< n; i++)
        {
            temp[x++] = nums[i];
            temp[x++]  = nums[i+n];
        }

        return temp;
    }
}