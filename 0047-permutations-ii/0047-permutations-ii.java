class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result =  new ArrayList<>();

        boolean [] curr = new boolean [nums.length];
        Arrays.sort(nums);
        backtrack (nums , curr , new ArrayList<>() , result);
        return result ;
    }

    private void backtrack (
        int[] nums ,
        boolean[] curr ,
        List<Integer> path ,
        List<List<Integer>> result ){

            if (path.size() == nums.length){
                result.add(new ArrayList<>(path));
                return ;
            }

            for ( int i = 0 ; i < nums.length ; i++){

                if (curr [i]){
                    continue ;
                }
                if (i > 0 && nums[i] == nums[i - 1] && !curr[i - 1])
                continue;

                path.add(nums[i]);
                curr[i] = true ;

                backtrack (nums , curr , path , result);

                path.remove(path.size() -1 );
                curr[i] = false ;

            }

    }
}