class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        if (n == 0)
        return 0;
        if( n == 1)
        return nums[0];

        int maxSum  = 0;
        int ultimateMax =nums[0];
        for(int i = 0; i< n; i++)
        {
            
           if(maxSum <0)
           maxSum = 0; 
          
          maxSum += nums[i];
          ultimateMax = Math.max(maxSum, ultimateMax );
        }
        return ultimateMax;
        
    }
}
 /*public int maxSubArray(int[] nums) {

        int n = nums.length;
        if (n == 0)
        return 0;
        if( n == 1)
        return nums[0];

        int maxSum  = nums[0];
        for(int i = 0; i< n; i++)
        {
            int sum = nums[i];
            int max = nums[i];
            for(int j = i+1; j < n; j++)
            {
                sum = sum + nums[j];
                 max = Math.max(max, sum);
            }

             maxSum = Math.max(maxSum, max);
             sum = 0; 
        }
        return maxSum;
        
    }*/