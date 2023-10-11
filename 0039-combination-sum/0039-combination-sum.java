class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();

         find(0, target, candidates, ans, new ArrayList<Integer>() );
         return ans;
    }


    public void find(int ind, int trg, int[] candidates, List<List<Integer>> ans, List<Integer> list)
    {
        //base
        if(ind == candidates.length)
        {
            if(trg == 0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }


        if(candidates[ind] <=trg)
        {
            list.add(candidates[ind]);
            find(ind, trg-candidates[ind],candidates, ans, list );
            list.remove(list.size() - 1);
        }


        find(ind+1, trg,candidates, ans, list);
     }
} 