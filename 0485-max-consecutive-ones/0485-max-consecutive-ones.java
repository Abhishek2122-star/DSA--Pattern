class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int MaxCount = 0 ;
        int CurrentCount = 0 ;

        for (int num : nums){
            if (num == 1 ){
                CurrentCount ++ ;
                MaxCount = Math.max(MaxCount , CurrentCount);

            }else{
                CurrentCount = 0 ;
            }
        } 
        return MaxCount;
    }
}