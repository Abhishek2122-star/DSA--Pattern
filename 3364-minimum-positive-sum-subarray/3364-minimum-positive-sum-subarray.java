class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

    int n = nums.size();
    int answer = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {

        int sum = 0;

        for (int j = i; j < n && j < i + r; j++) {

            sum += nums.get(j);

            int length = j - i + 1;

            if (length >= l && sum > 0) {
                answer = Math.min(answer, sum);
            }
        }
    }

    return answer == Integer.MAX_VALUE ? -1 : answer;
    }       
}