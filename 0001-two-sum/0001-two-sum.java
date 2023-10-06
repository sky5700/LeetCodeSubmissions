class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n = nums.length;

    if(n == 1 && nums[0] == target)
    return new int[]{0};

    int[] arr = new int[2];
     outer: for(int i = 0 ; i< n; i++)
     {
         int diff = target - nums[i];
         for(int j = i+1 ; j <n ; j++)
         {
             if(diff == nums[j])
             {
                 arr[0] = i;
                 arr[1] = j;
                 break outer;
             }
         }
     }
     return arr;   
    }
}