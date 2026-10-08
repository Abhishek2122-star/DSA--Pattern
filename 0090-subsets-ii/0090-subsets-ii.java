class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort so duplicate elements come together
        Arrays.sort(nums);

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
            int start,
            int[] nums,
            List<Integer> path,
            List<List<Integer>> result) {
        

        // Every path is a valid subset
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // TAKE
            path.add(nums[i]);

            // RECURSE
            backtrack(i + 1, nums, path, result);

            // UNDO
            path.remove(path.size() - 1);
        }
    }
}