class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        backtrack ( 0 , 0  , candidates , target , new ArrayList<>(),  result );
        return result ;
    }

    private void backtrack (
        int start ,
        int sum , 
        int[] candidates ,
        int target ,
        List<Integer> path ,
        List<List<Integer>> result ){

            if ( sum == target){
                result.add(new ArrayList(path));
                return ;
            }

            if ( sum > target){
                return ;
            }

            for ( int i = start ; i < candidates.length ; i++){
                path.add(candidates[i]);

                backtrack(
                    i ,
                    sum + candidates[i],
                    candidates,
                    target ,
                    path ,
                    result 
                );
                path.remove(path.size() - 1);
            }

        }

} 


