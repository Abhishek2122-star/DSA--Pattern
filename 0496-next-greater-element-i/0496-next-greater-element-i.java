class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashSet <Integer> set = new HashSet <>();

        for (int num : nums1){
            set.add(num);
        }

        HashMap < Integer , Integer > map = new HashMap <>();

        // let traverse nums2 
        for ( int i = 0 ; i < nums2.length ; i++){
            int curr = nums2[i];

            if (set.contains(curr)){

                int nextgreater = -1 ;

                for (int j = i + 1 ; j < nums2.length ; j++){
                    if (nums2[j] > curr){
                        nextgreater = nums2[j];
                        break ;
                    }
                }
                map.put(curr, nextgreater);
            }

        }
        int [] res = new int[nums1.length];
        for (int i = 0 ; i < nums1.length ; i++){
            res[i] = map.get(nums1[i]);
        }  
        return res ; 
        
    }
}