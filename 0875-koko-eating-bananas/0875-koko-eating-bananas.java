class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // maximum pile find
        for(int pile : piles){
            high = Math.max(high, pile);
        }

        int ans = high;

        while(low <= high){

            int mid = low + (high - low)/2;

            int hours = 0;

            for(int pile : piles){

                hours += Math.ceil((double)pile / mid);
            }


            if(hours <= h){
                ans = mid;
                high = mid - 1; // smaller speed try
            }
            else{
                low = mid + 1; // increase speed
            }
        }

        return ans;
    }
}










// public int minEatingSpeed(int[] piles, int h) {

//         int low = 1;
//         int high = 0;

//         // maximum pile find
//         for(int pile : piles){
//             high = Math.max(high, pile);
//         }

//         int ans = high;

//         while(low <= high){

//             int mid = low + (high - low)/2;

//             int hours = 0;

//             for(int pile : piles){

//                 hours += Math.ceil((double)pile / mid);
//             }


//             if(hours <= h){
//                 ans = mid;
//                 high = mid - 1; // smaller speed try
//             }
//             else{
//                 low = mid + 1; // increase speed
//             }
//         }

//         return ans;
//     }
