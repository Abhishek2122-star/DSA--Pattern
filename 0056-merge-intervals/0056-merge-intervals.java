class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length == 0 ) return new int [0][0];  

        Arrays.sort(intervals , (x , y ) -> x[0] - y[0]); 
        
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        
        for (int i = 0 ; i < intervals.length ; i++){

            int[]last = ans.get(ans.size() - 1);

            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            }
            // No overlap
            else {
                ans.add(intervals[i]);
            }

        }
        return ans.toArray(new int[ans.size()][]);

        

    }
}