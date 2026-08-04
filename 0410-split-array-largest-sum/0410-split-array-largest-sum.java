class Solution {
    public int splitArray(int[] nums, int k) {

        int left = 0 ; 
        int right = 0 ;

        for ( int n : nums){
            left = Math.max(left , n);
            right += n ;
        }
        
        int answers = right ;

        while(left <= right){
            int mid = left + ( right - left) / 2 ;

            int subarrays = 1 ;
            int currentsum = 0 ;

            for (int n : nums){
               if (currentsum + n > mid ){
                subarrays ++ ;
                currentsum = 0 ;

               }
               currentsum += n ; 
            }
            if (subarrays <= k ){
                answers = mid ;
                right = mid - 1 ;

            }else{
                left =  mid + 1 ; 
            }
        }   
        return answers  ;

        

        

        
        
    }
}