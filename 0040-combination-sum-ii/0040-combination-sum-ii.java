class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack ( 0 , 0 , candidates , target , new ArrayList<>() , result);

        return result ;
    }

    private void backtrack (
        int start ,
        int sum , 
        int [] candidates ,
        int target,
        List<Integer> path , 
        List<List<Integer>> result ){

            if ( sum == target){
                result.add(new ArrayList<>(path));
                return ;
            }
            // if ( sum > target){
            //     return ;
            // }

            for ( int i = start ; i < candidates.length ; i++){

                if ( sum + candidates[i] > target){
                    break ;
                }

                if ( i >  start && candidates[i] == candidates[i-1]){
                    continue ;
                }

                path.add(candidates[i]);

                backtrack (
                    i + 1 ,
                    sum + candidates[i],
                    candidates,
                    target , 
                    path , result
                );

                path.remove(path.size() - 1);

            }
        }

}