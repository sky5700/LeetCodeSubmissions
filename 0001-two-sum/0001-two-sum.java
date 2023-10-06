class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n = nums.length;

    if(n == 1 && nums[0] == target)
    return new int[]{0};
     
    Map<Integer, Integer > mp = new HashMap<>();
    //Adding in map with element  as key and index as value
    for(int i = 0; i<n; i++)
    {
        mp.put(nums[i], i);
    }

    for(int i = 0 ; i< n; i++)
    {
      int mytrgt =   target - nums[i];

      if(mp.containsKey(mytrgt) && mp.get(mytrgt)!= i)
       {
           return new int[]{i,mp.get(mytrgt)};
           
       }
    }
    return new int[]{};
   
    }
}
/*
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
*/